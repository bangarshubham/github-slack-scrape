
package org.appops.slack;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlackAutomationScript {

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://slofile.com/slack");
    driver.manage().window().maximize();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1850)", "");
    Thread.sleep(2000);
    WebElement androidChatWorkspace = driver.findElement(By.cssSelector(
        "body > div.teams-list > div > div.row.teams > div:nth-child(28) > div > div.icon-right > div.name > a"));
    androidChatWorkspace.click();


    Thread.sleep(5000);
    WebElement joinButton =
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div[3]/a"));
    joinButton.click();

    Thread.sleep(2000);
    ArrayList<String> twoTabs = new ArrayList<String>(driver.getWindowHandles());

    driver.switchTo().window(twoTabs.get(1));
    System.out.println(driver.getCurrentUrl());

    Thread.sleep(1000);
    WebElement signInWithSlack = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[2]/img"));
    signInWithSlack.click();

    WebElement continueWithGoogleButton = driver.findElement(By.id("google_login_button"));
    continueWithGoogleButton.click();

    Thread.sleep(1000);
    WebElement googleEmailTextbox = driver.findElement(By.id("identifierId"));
    googleEmailTextbox.sendKeys("githubscraping-aino2@infozymes.com");

    Thread.sleep(1000);
    WebElement nextButton1 = driver.findElement(By.xpath(
        "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button"));
    nextButton1.click();

    Thread.sleep(3000);
    WebElement googlePasswordTextBox = driver.findElement(By.name("password"));
    googlePasswordTextBox.sendKeys("aino2-github");

    Thread.sleep(1000);
    WebElement nextButton2 = driver.findElement(By.xpath(
        "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button"));
    nextButton2.click();


    // Thread.sleep(1000);
    // WebElement slackCreateAccBtn =
    // driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/form/button"));
    // slackCreateAccBtn.click();

    ///////////////////////////// Phantom buster script ////////////////////////////////////

    Thread.sleep(15000);
    js.executeScript("window.open('https://phantombuster.com/')");
    ArrayList<String> threeTabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(threeTabs.get(2));
    System.out.println(driver.getCurrentUrl());

    Thread.sleep(10000);
    WebElement phantomLoginBtn =
        driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/nav[2]/ol/li[1]/a"));
    phantomLoginBtn.click();

    Thread.sleep(1000);
    WebElement phantomEmailTxtBox = driver.findElement(By.name("email"));
    phantomEmailTxtBox.sendKeys("githubscraping-aino2@infozymes.com");

    Thread.sleep(1000);
    WebElement phantomPassTxtBox = driver.findElement(By.name("password"));
    phantomPassTxtBox.sendKeys("aino2-github");

    Thread.sleep(1000);
    WebElement phantomLogInBtn = driver.findElement(
        By.xpath("/html/body/div[1]/div/div/section/div/div/div/div/div/div[2]/form/button"));
    phantomLogInBtn.click();

    Thread.sleep(3000);
    WebElement browsePhantomBtn = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/div/div[1]/div[2]/div"));
    browsePhantomBtn.click();

    Thread.sleep(2000);
    WebElement phantomSlackBtn = driver
        .findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div[2]/aside/ul/a[22]/span"));
    phantomSlackBtn.click();

    Thread.sleep(1000);
    WebElement phantomChromeExt =
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/a"));
    phantomChromeExt.click();

    ArrayList<String> fourTabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(fourTabs.get(3));
    System.out.println(driver.getCurrentUrl());

    Thread.sleep(5000);
    WebElement addToChromeBtn = driver.findElement(By.className("g-c-x"));
    addToChromeBtn.click();

    Thread.sleep(10000);
    driver.switchTo().window(fourTabs.get(2));
    System.out.println(driver.getCurrentUrl());


    Thread.sleep(5000);
    WebElement phantomUseThisBtn = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div[2]/div/div/div/div[1]/footer/button"));
    phantomUseThisBtn.click();


    Thread.sleep(3000);
    WebElement connectToSlackBtn =
        driver.findElement(By.className("pbExtensionNewSetupCookieButton"));
    connectToSlackBtn.click();

    Thread.sleep(1000);
    WebElement slackWorkspaceUrlTxtBox = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[2]/div/input"));
    String slackWorkspaceUrl = driver.switchTo().window(fourTabs.get(1)).getCurrentUrl();
    System.out.println(slackWorkspaceUrl);

    Thread.sleep(3000);
    driver.switchTo().window(fourTabs.get(2));
    System.out.println(driver.getCurrentUrl());

    Thread.sleep(3000);
    slackWorkspaceUrlTxtBox.sendKeys(slackWorkspaceUrl);

    Thread.sleep(1000);
    WebElement phantomSaveBtn1 = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[3]/button"));
    phantomSaveBtn1.click();

    Thread.sleep(5000);
    WebElement channelNameTxtBox = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[1]/div/input"));
    channelNameTxtBox.sendKeys("#_announcements");

    Thread.sleep(1000);
    WebElement phantomSaveBtn2 = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[4]/button[2]"));
    phantomSaveBtn2.click();

    Thread.sleep(3000);
    WebElement noOfChannelTxtBox = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[1]/div/input"));
    noOfChannelTxtBox.sendKeys("20");

    WebElement resultFileSetting = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[5]/div/span"));
    resultFileSetting.click();

    Thread.sleep(3000);
    WebElement resultFileTxtBox = driver.findElement(By.xpath(
        "/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[6]/div/div/input"));
    resultFileTxtBox.sendKeys("Android-Chat");

    Thread.sleep(3000);
    WebElement phantomSaveBtn3 = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[7]/button[2]"));
    phantomSaveBtn3.click();

    js.executeScript("window.scrollBy(0,2500)", "");

    Thread.sleep(5000);
    WebElement phantomSaveBtn4 = driver.findElement(By
        .xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/main/div/form/div[10]/button[2]"));
    phantomSaveBtn4.click();


    Thread.sleep(5000);
    WebElement launchButton = driver.findElement(
        By.xpath("/html/body/div[1]/div/div[2]/section/section[1]/div/div[2]/div/button"));
    launchButton.click();

    Thread.sleep(80000);
    WebElement downloadCsvBtn = driver
        .findElement(By.xpath("/html/body/div[1]/div/div[2]/section/section[1]/div/div[2]/div/a"));
    downloadCsvBtn.click();

  }
}
