
package org.appops.github;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
// import org.appops.github.pojo.GithubUserPojo;
import org.kohsuke.github.GHCommit;
import org.kohsuke.github.GHCommit.ShortInfo;
import org.kohsuke.github.GHOrganization;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepository.Contributor;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.kohsuke.github.GitUser;

public class GHContribEmailScrape extends Thread {

  private String ghUserName;
  private String ghPersonalToken;
  private String ghOrganizationName;

  public GHContribEmailScrape(String ghUserName, String ghPersonalToken,
      String ghOrganizationName) {
    super();
    this.ghUserName = ghUserName;
    this.ghPersonalToken = ghPersonalToken;
    this.ghOrganizationName = ghOrganizationName;
  }

  public void run() {
    System.out.println("GHContribEmailScrape Thread running");
    try {
      GitHub github =
          new GitHubBuilder().withOAuthToken(this.ghPersonalToken, this.ghUserName).build();
      GHOrganization ghOrganization = github.getOrganization(this.ghOrganizationName);
      List<GHRepository> gRepositoryList = ghOrganization.listRepositories().toList();

      for (GHRepository gRepository : gRepositoryList) {
        gRepository.getOwnerName(); // return organization name

        gRepository.getName(); // return repo name

        List<Contributor> contributorList =
            gRepository.listContributors().withPageSize(900).toList();
        try {
          for (Contributor contributor : contributorList) {
            GithubUserSlim githubUserSlim = new GithubUserSlim();
            githubUserSlim.setUserId(contributor.getId());
            githubUserSlim.setOrganizationName(gRepository.getOwnerName());
            githubUserSlim.setRepositoryName(gRepository.getName());
            githubUserSlim.setUserName(contributor.getLogin());
            githubUserSlim.setContributorFlag(true);
            githubUserSlim.setWatcherFlag(false);
            githubUserSlim.setForkersFlag(false);
            githubUserSlim.setStargazersFlag(false);
            if (contributor.getEmail() != null) {
              githubUserSlim.setCompanyName(contributor.getCompany());
              githubUserSlim.setEmailId(contributor.getEmail());
              saveGithubUserInfo(githubUserSlim);
              System.out.println(contributor.getEmail());
            } else {
              List<GHRepository> contribRepoList = contributor.listRepositories().toList();
              for (GHRepository contribRepo : contribRepoList) {
                if (contribRepo != null) {
                  if (contribRepo.isFork() != true) {
                    // System.out.println("======= Found contributor own repo ==========");
                    if (contribRepo.getLanguage() != null) {
                      try {
                        List<GHCommit> contribCommitList = contribRepo.listCommits().toList();
                        for (GHCommit contribCommt : contribCommitList) {
                          // System.out.println("====== Found contributor commit message ======");
                          ShortInfo contribCommitInfo = contribCommt.getCommitShortInfo();
                          GitUser gitUser = contribCommitInfo.getCommitter();
                          String contribEmail = gitUser.getEmail();
                          // System.out.println("Contributor email : " + contribEmail);
                          githubUserSlim.setCompanyName(contributor.getCompany());
                          githubUserSlim.setEmailId(contribEmail);
                          saveGithubUserInfo(githubUserSlim);
                          System.out.println(contribEmail);
                          break;
                        }
                      } catch (IOException e) {
                        e.printStackTrace();
                      }
                    }
                    break;
                  }
                }
              }
            }
          }
        } catch (Exception e) {
          System.out.println(e);
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
      // // Thread.sleep(15000);
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
