package org.appops.github;

public class GithubUserSlim {
  private long userId;
  private String userName;
  private String emailId;
  private String organizationName;
  private String repositoryName;
  private String companyName;
  private Boolean contributorFlag;
  private Boolean stargazersFlag;
  private Boolean forkersFlag;
  private Boolean watcherFlag;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Boolean getContributorFlag() {
    return contributorFlag;
  }

  public void setContributorFlag(Boolean contributorFlag) {
    this.contributorFlag = contributorFlag;
  }

  public Boolean getStargazersFlag() {
    return stargazersFlag;
  }

  public void setStargazersFlag(Boolean stargazersFlag) {
    this.stargazersFlag = stargazersFlag;
  }

  public Boolean getForkersFlag() {
    return forkersFlag;
  }

  public void setForkersFlag(Boolean forkersFlag) {
    this.forkersFlag = forkersFlag;
  }

  public Boolean getWatcherFlag() {
    return watcherFlag;
  }

  public void setWatcherFlag(Boolean watcherFlag) {
    this.watcherFlag = watcherFlag;
  }

}
