package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignupPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SignupStep {
    static AppiumDriver driver;
    SignupPage signupPage ;

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Given("Kullanıcı giriş sayfasını görüntüler.")
    public void kullanıcıGirişSayfasınıGörüntüler() {
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

    @When("Kullanıcı gelen ekrandan kayıt ol butonuna tıklar.")
    public void kullanıcıGelenEkrandanKayıtOlButonunaTıklar() {
       signupPage.clickSignupPageButton(driver);
    }


    @And("Kullanıcı kayıt ol sayfasını doğrular.")
    public void kullanıcıKayıtOlSayfasınıDoğrular() {
        Assert.assertEquals("Kayıt Ol",signupPage.getScreenSignupPageTitle());

    }


    @And("Kullanıcı name kısmına {string} ismini yazar.")
    public void kullanıcıNameKısmınaIsminiYazar() {
        signupPage.fillName(driver,"Ali");
    }

    @And("Kullanıcı surname kısmına {string} soyismini yazar.")
    public void kullanıcıSurnameKısmınaSoyisminiYazar() {
        signupPage.fillSurname(driver,"Yılmaz");
    }

    @And("Kullanıcı {string} email adresini yazar.")
    public void kullanıcıEmailAdresiniYazar() {
        signupPage.fillEmail(driver,"ali.yilmaz@example.com" );
    }

    @And("Kullanıcı {string} tckn kısmına yazar.")
    public void kullanıcıTcknKısmınaYazar() {
        signupPage.fillTckn(driver, "12345678901");
    }

    @And("Kullanıcı {string} telefon numarası kısmına yazar.")
    public void kullanıcıTelefonNumarasıKısmınaYazar() {
        signupPage.fillPhoneNumber(driver,"530 000 00 00");
    }

    @And("Kullanıcı {string} şifresini girer.")
    public void kullanıcıŞifresiniGirer() {
        signupPage.fillPassword(driver, "Ali.12345");
    }

    @And("Kullanıcı {string} tıklar.")
    public void kullanıcıTıklar() {
        signupPage.clickKvkkButton(driver);
    }

    @And("Kullanıcı {string} butonuna tıklar")
    public void kullanıcıButonunaTıklar() {
        signupPage.clickSignupButton(driver);

    }

    @Then("Kullanıcıya {string} mesajı gösterilmelidir")
    public void kullanıcıyaMesajıGösterilmelidir() {
        Assert.assertEquals("Hesabınız başarıyla oluşturuldu",signupPage.getSignupMessage());
        driver.quit();

    }

    @Then("Kullanıcıya {string} mesajı gösterilmelidir")
    public void kullanıcıyaMesajıGösterilmelidir(String mesaj,String Mesaj) {
        Assert.assertEquals("Bu email adresi zaten kullanılıyor ",signupPage.getSignupFalseEmailMessage());
        driver.quit();

    }


    @And("Kullanıcı surname {string} soyismini yazar")
    public void kullanıcıSurnameSoyisminiYazar(String arg0) {
        signupPage.fillName(driver,"Alihan");
        signupPage.fillPassword(driver, "Yıldırım");
    }


    @Then("Kullanıcıya {string} hata mesajı görülür.")
    public void kullanıcıyaHataMesajıGörülür(String arg0) {
        Assert.assertEquals("Tckn numarası 11 hane olmalıdır. ",signupPage.getSignupFalseTcknMessage());
        driver.quit();
    }

    @Then("Kullanıcıya {string} butonuna tıklayınız mesajı görülür.")
    public void kullanıcıyaButonunaTıklayınızMesajıGörülür(String arg0) {
        Assert.assertEquals("Kvkk aydınlatma metnini onaylıyorum. butonuna tıklayınız ",signupPage.getSignupFalseKvkkMessage());
        driver.quit();
    }

    @Then("Kullanıcıya Zorunlu alanlar boş bırakılamaz. mesajı gösterilmelidir.")
    public void kullanıcıyaZorunluAlanlarBoşBırakılamazMesajıGösterilmelidir() {
        Assert.assertEquals("Zorunlu alanları doldurunuz. ",signupPage.getSignupFalserequiredMessage());
        driver.quit();

    }

    @Then("Kullanıcıya {string} mesajı gösterilmelidir.")
    public void kullanıcıyaMesajıGösterilmelidir(String mesaj) {
        mesaj ="Zorunlu alanlar boş bırakılamaz.";
        Assert.assertEquals(mesaj,signupPage.getSignupFalsePasswordMessage());
        driver.quit();


    }

}
