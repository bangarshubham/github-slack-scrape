
package org.appops.github;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.kohsuke.github.GHCommit;
import org.kohsuke.github.GHCommit.ShortInfo;
import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.kohsuke.github.GitUser;

public class GHForkersEmailScrape extends Thread {

  private String ghUserName;
  private String ghPersonalToken;
  private String ghOrganizationName;

  public GHForkersEmailScrape(String ghUserName, String ghPersonalToken,
      String ghOrganizationName) {
    super();
    this.ghUserName = ghUserName;
    this.ghPersonalToken = ghPersonalToken;
    this.ghOrganizationName = ghOrganizationName;
  }

  public void run() {
    System.out.println("GHForkersEmailScrape Thread running");
    try {
      GitHub github =
          new GitHubBuilder().withOAuthToken(this.ghPersonalToken, this.ghUserName).build();
      GHOrganization ghOrganization = github.getOrganization(this.ghOrganizationName);
      List<GHRepository> gRepositoryList = ghOrganization.listRepositories().toList();

      for (GHRepository gRepository : gRepositoryList) {
        List<GHRepository> ghForkRepoList = gRepository.listForks().toList();
        try {
          for (GHRepository ghForkRepo : ghForkRepoList) {
            try {
              if (ghForkRepo.getOwner() != null) {
                GHUser ghUser = ghForkRepo.getOwner();
                GithubUserSlim githubUserSlim = new GithubUserSlim();
                githubUserSlim.setUserId(ghUser.getId());
                githubUserSlim.setOrganizationName(gRepository.getOwnerName());
                githubUserSlim.setRepositoryName(gRepository.getName());
                githubUserSlim.setUserName(ghUser.getLogin());
                githubUserSlim.setForkersFlag(true);
                githubUserSlim.setContributorFlag(false);
                githubUserSlim.setWatcherFlag(false);
                githubUserSlim.setStargazersFlag(false);
                if (ghUser.getEmail() != null) {
                  githubUserSlim.setCompanyName(ghUser.getCompany());
                  githubUserSlim.setEmailId(ghUser.getEmail());
                  saveGithubUserInfo(githubUserSlim);
                  System.out.println(ghUser.getEmail());
                } else {
                  List<GHRepository> forkUserRepoList = ghUser.listRepositories().toList();
                  for (GHRepository forkUserRepo : forkUserRepoList) {
                    if (forkUserRepo != null) {
                      if (forkUserRepo.isFork() != true) {
                        // System.out.println("======= Found contributor own repo ==========");
                        if (forkUserRepo.getLanguage() != null) {
                          if (forkUserRepo.getSize() != 0) {
                            List<GHCommit> forkUserCommitList = forkUserRepo.listCommits().toList();
                            try {
                              for (GHCommit forkUSerCommt : forkUserCommitList) {
                                // System.out.println("====== Found contributor commit message
                                // ======");
                                ShortInfo forkUserCommitInfo = forkUSerCommt.getCommitShortInfo();
                                GitUser gitUser = forkUserCommitInfo.getCommitter();
                                String forkUserEmail = gitUser.getEmail();
                                githubUserSlim.setCompanyName(ghUser.getCompany());
                                githubUserSlim.setEmailId(forkUserEmail);
                                saveGithubUserInfo(githubUserSlim);
                                System.out.println(forkUserEmail);
                                break;
                              }
                            } catch (IOException e) {
                              e.printStackTrace();
                            }

                          }
                        }
                        break;
                      }
                    }
                  }
                }
              }
            } catch (IOException e) {
              e.printStackTrace();
            }

          }

        } catch (Exception e) {
          e.printStackTrace();
        }

      }



    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  private void saveGithubUserInfo(GithubUserSlim githubUserSlim) throws SQLException {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GithubScraping", "root",
          "mysql#htznr");
      Statement stmt = connection.createStatement();
      Thread.sleep(5000);
      boolean rs = stmt.execute("INSERT INTO GithubScraping.github_user_details VALUES " + "("
          + githubUserSlim.getUserId() + "," + "'" + githubUserSlim.getUserName() + "'" + "," + "'"
          + githubUserSlim.getEmailId() + "'" + "," + "'" + githubUserSlim.getOrganizationName()
          + "'" + "," + "'" + githubUserSlim.getRepositoryName() + "'" + "," + "'"
          + githubUserSlim.getCompanyName() + "'" + "," + githubUserSlim.getContributorFlag() + ","
          + githubUserSlim.getWatcherFlag() + "," + githubUserSlim.getForkersFlag() + ","
          + githubUserSlim.getStargazersFlag() + ")");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // try {
      // Thread.sleep(15000);
      // } catch (InterruptedException e) {
      // e.printStackTrace();
      // }
      connection.close();
    }
  }

  public String getGhUserName() {
    return ghUserName;
  }

  public void setGhUserName(String ghUserName) {
    this.ghUserName = ghUserName;
  }

  public String getGhPersonalToken() {
    return ghPersonalToken;
  }

  public void setGhPersonalToken(String ghPersonalToken) {
    this.ghPersonalToken = ghPersonalToken;
  }

  public String getGhOrganizationName() {
    return ghOrganizationName;
  }

  public void setGhOrganizationName(String ghOrganizationName) {
    this.ghOrganizationName = ghOrganizationName;
  }

}
