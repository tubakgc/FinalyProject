package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.LogoutPage;

import java.net.MalformedURLException;
import java.net.URL;

public class LogoutStep {

    static AppiumDriver driver;
    LogoutPage logoutPage = new LogoutPage(driver) ;
    LoginPage loginPage;

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Given("Kullanıcı anasayfadadır")
    public void kullanıcıAnasayfadadır() {
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

    @When("Kullanıcı profil sayfasına gider")
    public void kullanıcıProfilSayfasınaGider() {
        logoutPage.clickProfil(driver);
    }

    @And("Kullanıcı Çıkış butonuna tıklar")
    public void kullanıcıÇıkışButonunaTıklar() {
        logoutPage.clicklogOut(driver);
    }

    @And("Kullanıcı gelen pencerede ki  {string} butonuna tıklar")
    public void kullanıcıGelenPenceredeKiButonunaTıklar(String arg0) {
        logoutPage.clicklogOutYes(driver);
    }

    @Then("Kullanıcı Giriş sayfasına yönlendirilmelidir")
    public void kullanıcıGirişSayfasınaYönlendirilmelidir() {
        Assert.assertEquals("Giriş Yap",logoutPage.getloginpageMessage());
        driver.quit();

    }

    @And("Kullanıcı gelen pencerede ki  hayır butonuna tıklar")
    public void kullanıcıGelenPenceredeKiHayırButonunaTıklar() {
        logoutPage.clicklogOutNo(driver);
        driver.quit();

    }
}
