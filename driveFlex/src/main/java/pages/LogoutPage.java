package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    static AppiumDriver driver;
    public LogoutPage (AppiumDriver driver) {
        this.driver = driver;
    }

    public final By profilloc = By.id("");
    public final By logOutLoc = By.id("");
    public final By  logOutYesloc =By.id("");
    public final By  logOutNoloc =By.id("");
    public final By  loginpageloc =By.id("");

    private WebElement ProfilElement(WebDriver driver){
        WebElement profilButton = driver.findElement(profilloc);
        return profilButton;
    }

    private WebElement logOutElement(WebDriver driver){
        WebElement logOutButton = driver.findElement(logOutLoc);
        return logOutButton;
    }

    private WebElement logOutYesElement(WebDriver driver){
        WebElement logOutYesButton = driver.findElement(logOutYesloc);
        return logOutYesButton;
    }
    private WebElement logOutNoElement(WebDriver driver){
        WebElement logOutNoButton = driver.findElement(logOutNoloc);
        return logOutNoButton;
    }

    public void clickProfil( WebDriver driver) {
        ProfilElement(driver).click();
    }

    public void clicklogOut( WebDriver driver) {
        logOutElement(driver).click();
    }

    public void clicklogOutYes( WebDriver driver) {
        logOutYesElement(driver).click();
    }
    public void clicklogOutNo( WebDriver driver) {
        logOutNoElement(driver).click();
    }
    public String getloginpageMessage() {
        return driver.findElement(loginpageloc).getText();
    }
}
