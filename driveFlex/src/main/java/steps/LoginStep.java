package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginStep {
    private static final Log log = LogFactory.getLog(LoginStep.class);
    static AppiumDriver driver;
LoginPage loginPage;
    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Given("Kullanıcı Giriş sayfasındadır")
    public void kullanıcıGirişSayfasındadır() {
        var options = new BaseOptions()
                .amend("platformName", "Android")
                .amend("appium:deviceName", "Pixel 6")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:udid", "Android Emulator")
                .amend("appium:avd", "Pixel_6_Pro_API_32")
                .amend("appium:fastReset", true)
                .amend("appium:newCommandTimeout", 5)
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:connectHardwareKeyboard", true)
                .amend("appium:app", "/Users/tugbakguc/Desktop/appiumapk/selendroid-test-app.apk");


        driver = new AndroidDriver(this.getUrl(), options);
    }

    @When("Kullanıcı geçerli e-mail {string} ve şifre {string} girer")
    public void kullanıcıGeçerliEMailVeŞifreGirer() {
        loginPage.fillEmailLogin(driver,"ali@example.com" );
        loginPage.fillpasswordLogin(driver,"password123");
    }

    @And("Kullanıcı Giriş butonuna tıklar")
    public void kullanıcıGirişButonunaTıklar() {
        loginPage.clickLoginButton(driver);
    }

    @Then("Kullanıcı araç kirala ekranına yönlendirilmelidir")
    public void kullanıcıAraçKiralaEkranınaYönlendirilmelidir() {
        Assert.assertEquals("Araç Kirala", loginPage.getScreenCarRentalPageTitle());
        driver.quit();

    }

    @When("Kullanıcı geçersiz e-mail {string} yazar")
    public void kullanıcıGeçersizEMailYazar() {
        loginPage.fillEmailLogin(driver,"ali" );
    }

    @And("Kullanıcı  şifre {string} girer")
    public void kullanıcıŞifreGirer() {
        loginPage.fillpasswordLogin(driver ,"password123");
    }

    @Then("Kullanıcı {string} hatası verir.")
    public void kullanıcıHatasıVerir() {
        Assert.assertEquals("Geçersiz e-mail ve ya password girdiniz.", loginPage.getLoginFalseMessage());
        driver.quit();
    }

    @When("Kullanıcı geçerli e-mail {string} yazar")
    public void kullanıcıGeçerliEMailYazar() {
        loginPage.fillEmailLogin(driver,"ali@example.com" );
    }

    @And("Kullanıcı  geçersiz şifre {string} girer")
    public void kullanıcıGeçersizŞifreGirer() {
        loginPage.fillpasswordLogin(driver,"1");
    }

    @And("Kullanıcı email ve password ekranının doğru olduğunu doğrular.")
    public void kullanıcıEmailVePasswordEkranınınDoğruOlduğunuDoğrular() {
      Assert.assertEquals("ali@example.com)",loginPage.getLoginRememberEmailMessage());
      Assert.assertEquals("password123",loginPage.getLoginRememberPasswordMessage());
        driver.quit();
    }

    @And("Kullanıcı şifremi unuttum butonuna tıklar")
    public void kullanıcıŞifremiUnuttumButonunaTıklar() {
        loginPage.clickpasswordForgetButton(driver);
    }

    @And("Kullanıcı gelen emaili onaylar ve yeni şifreyi girer.")
    public void kullanıcıGelenEmailiOnaylarVeYeniŞifreyiGirer() {
        loginPage.fillNewPasswordLogin(driver, "passwordAli123");
    }

    @Then("Kullanıcı geçerli e-mail {string} ve yeni şifre {string} girer")
    public void kullanıcıGeçerliEMailVeYeniŞifreGirer(String arg0, String arg1) {
        loginPage.fillEmailLogin(driver,"ali@example.com");
        loginPage.fillpasswordLogin(driver,"passwordAli123");
        loginPage.clickLoginButton(driver);
        driver.quit();
    }


}
