package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignupPage {
    static AppiumDriver driver;
    public SignupPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public final By signupPageButtonloc = By.id("");
    public final By signupPageAssertloc = By.id("");
    public final By nameloc = By.id("");
    public final By surnameloc = By.id("");
    public final By emailloc = By.id("");
    public final By tcknloc = By.id("");
    public final By phoneloc = By.id("");
    public final By passwordSignuploc = By.id("");
    public final By kvkkloc=By.id("");
    public final By signupButtonloc = By.id("");
    public final By signupPageTrueloc = By.id("");
    public final By SignupFalseEmailloc  = By.id("");
    public final By SignupFalsePasswordloc  = By.id("");
    public final By SignupFalseTcknloc = By.id("");
    public final By SignupFalseKvkkloc  = By.id("");
    public final By SignupFalserequiredloc  = By.id("");

    private WebElement signupPageButtonPageElement(WebDriver driver){
        WebElement signupPageButtonPage = driver.findElement(signupPageButtonloc);
        return signupPageButtonPage;

    }
    private WebElement nameElement(WebDriver driver){
        WebElement nameSignup = driver.findElement(nameloc);
        return nameSignup;
    }
    private WebElement surnameElement(WebDriver driver){
        WebElement surnameSignup = driver.findElement(surnameloc);
        return surnameSignup;

    }
    private WebElement emailSignupElement(WebDriver driver){
        WebElement emailSignup = driver.findElement(emailloc);
        return emailSignup;
    }
    private WebElement tcknElement(WebDriver driver){
        WebElement tckn = driver.findElement(tcknloc);
        return tckn;
    }
    private WebElement phoneElement(WebDriver driver){
        WebElement phoneNumber = driver.findElement(phoneloc);
        return phoneNumber;
    }
    private WebElement passwordSignupElement(WebDriver driver){
        WebElement passwordSignup = driver.findElement(passwordSignuploc);
        return passwordSignup;
    }
    private WebElement kvkkButtonElement(WebDriver driver){
        WebElement kvkkButton = driver.findElement(kvkkloc);
        return kvkkButton;
    }
    private WebElement signupButtonElement(WebDriver driver){
        WebElement signupButton = driver.findElement(signupButtonloc);
        return signupButton;
    }

    public void clickSignupPageButton( WebDriver driver) {
        signupPageButtonPageElement(driver).click();
    }
    public String getScreenSignupPageTitle() {
        return driver.findElement(signupPageAssertloc).getText();
    }
    public void fillName( WebDriver driver,String name) {
        nameElement(driver).sendKeys(name);
    }
    public void fillSurname( WebDriver driver,String surname) {
        surnameElement(driver).sendKeys(surname);
    }
    public void fillEmail( WebDriver driver,String email) {
        emailSignupElement(driver).sendKeys(email);
    }
    public void fillTckn( WebDriver driver,String tckn) {
        tcknElement(driver).sendKeys(tckn);
    }
    public void fillPhoneNumber( WebDriver driver,String phone) {
        phoneElement(driver).sendKeys(phone);
    }
    public void fillPassword( WebDriver driver,String password) {
        passwordSignupElement(driver).sendKeys(password);
    }
    public void clickKvkkButton( WebDriver driver) {
       kvkkButtonElement(driver).click();
    }
    public void clickSignupButton( WebDriver driver) {
        signupButtonElement(driver).click();
    }
    public String getSignupMessage() {
        return driver.findElement(signupPageTrueloc).getText();
    }
    public String getSignupFalseEmailMessage() {
        return driver.findElement(SignupFalseEmailloc).getText();
    }
    public String getSignupFalsePasswordMessage() {
        return driver.findElement(SignupFalsePasswordloc).getText();
    }
    public String getSignupFalseTcknMessage() {
        return driver.findElement(SignupFalseTcknloc).getText();
    }
    public String getSignupFalseKvkkMessage() {
        return driver.findElement(SignupFalseKvkkloc).getText();
    }
    public String getSignupFalserequiredMessage() {
        return driver.findElement(SignupFalserequiredloc).getText();
    }



}
