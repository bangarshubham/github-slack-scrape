
package org.appops.slack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlackInfoSelenium {

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://app.slack.com/client/T036FVCL1/D02H57DLBNE");
    driver.manage().window().maximize();

    WebElement workspaceUrlTextBox = driver.findElement(By.id("domain"));
    workspaceUrlTextBox.sendKeys("gdgistanbul");

    Thread.sleep(1000);

    WebElement continueButton =
        driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[2]/form/button"));
    continueButton.click();

    WebElement emailTextBox = driver.findElement(By.id("email"));
    emailTextBox.sendKeys("githubscraping-aino1@infozymes.com");

    Thread.sleep(1000);

    WebElement passwordTextBox = driver.findElement(By.id("password"));
    passwordTextBox.sendKeys(("aino1-github"));

    Thread.sleep(2000);

    WebElement signInButton = driver.findElement(By.id("signin_btn"));
    signInButton.click();

    WebElement generalChannelClick = driver.findElement(By.xpath(
        "/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[6]/div/span"));

    Thread.sleep(2000);
    generalChannelClick.click();
    Thread.sleep(2000);
    WebElement generalMemberListButton = driver.findElement(
        By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/div[1]/button"));
    Thread.sleep(1000);
    generalMemberListButton.click();


    WebElement membersTab = driver.findElement(By.id("members"));
    membersTab.click();
    Thread.sleep(2000);

    WebElement firstMemeber = driver.findElement(By.xpath(
        "/html/body/div[7]/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div/div[3]/div/div/div/div/span/span"));

    firstMemeber.click();

    WebElement viewFullProfileButton =
        driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/button"));
    Thread.sleep(1000);
    viewFullProfileButton.click();


  }
}
