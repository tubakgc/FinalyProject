package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    static AppiumDriver driver;
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public final By emailLoginloc = By.id("");
    public final By passwordLoginloc = By.id("");
    public final By loginButtonloc = By.id("");
    public final By passwordForgetLoginloc = By.id("");
    public final By rememberloc = By.id("");
    public final By loginPageFalseloc = By.id("");
    public final By carRentalPageloc = By.id("");
    public final By rememberPageloc = By.id("");
    public final By newPasswordLoginloc = By.id("");



    private WebElement emailLoginElement(WebDriver driver){
        WebElement emailLogin = driver.findElement(emailLoginloc);
        return emailLogin;
    }
    private WebElement passwordLoginElement(WebDriver driver){
        WebElement passwordLogin = driver.findElement(passwordLoginloc);
        return passwordLogin;
    }
    private WebElement passwordForgetElement(WebDriver driver){
        WebElement passwordForgetLogin = driver.findElement(passwordForgetLoginloc);
        return passwordForgetLogin;
    }
    private WebElement rememberElement(WebDriver driver){
        WebElement rememberLogin = driver.findElement(rememberloc);
        return rememberLogin;
    }
    private WebElement loginButtonElement(WebDriver driver){
        WebElement loginButton = driver.findElement(loginButtonloc);
        return loginButton;
    }
    private WebElement newPasswordForgetElement(WebDriver driver){
        WebElement newPasswordForgetLogin = driver.findElement(newPasswordLoginloc);
        return newPasswordForgetLogin;
    }

    public void fillEmailLogin( WebDriver driver,String emailLogin) {
       emailLoginElement(driver).sendKeys(emailLogin);
    }
    public void fillpasswordLogin( WebDriver driver,String passwordLogin) {
        passwordLoginElement(driver).sendKeys(passwordLogin);

    }
    public void clickLoginButton( WebDriver driver) {
        loginButtonElement(driver).click();
    }

    public void clickpasswordForgetButton( WebDriver driver) {
        passwordForgetElement(driver).click();
    }
    public void clickRememberButton( WebDriver driver) {
        rememberElement(driver).click();
    }

    public String getLoginFalseMessage() {
        return driver.findElement(loginPageFalseloc).getText();
    }
    public String getScreenCarRentalPageTitle() {
        return driver.findElement(carRentalPageloc).getText();
    }
    public String getScreenRememberPageTitle() {
        return driver.findElement(rememberPageloc).getText();
    }
    public void fillNewPasswordLogin( WebDriver driver,String newPasswordLogin) {
        newPasswordForgetElement(driver).sendKeys(newPasswordLogin);

    }
    public String getLoginRememberEmailMessage() {
        return driver.findElement(emailLoginloc).getText();
    }
    public String getLoginRememberPasswordMessage() {
        return driver.findElement(passwordLoginloc).getText();
    }







}
