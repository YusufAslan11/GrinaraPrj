package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Login_Page;
import pages.Register_Page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class MyStepdefs {

    Register_Page page=new Register_Page();
    Login_Page login=new Login_Page();
    Faker fake=new Faker();


    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String Grinara_Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Grinara_Url));
        bekle(5);
    }

    @Then("Kullanici account butonuna basar")
    public void kullanici_account_butonuna_basar() {

       page.register_myAccount.click();
        bekle(2);


    }
    @Then("Kullanici register sekmesine tiklar")
    public void kullanici_register_sekmesine_tiklar() {
        click(page.register_register);
        bekle(2);

    }
    @Then("Kullanici mail adresini girer")
    public void kullanici_mail_adresini_girer() {
        page.register_email.sendKeys(fake.internet().emailAddress());


    }
    @Then("Kullanici register butonuna basar")
    public void kullanici_register_butonuna_basar() {
        click(page.register_verify);
        bekle(2);

    }
    @Then("Kullanici register isleminin basarili oldugunu dogrular2")
    public void kullanici_register_isleminin_basarili_oldugunu_dogrular() {
         page.edit_account.click();

    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

    }


    @And("Kullanici login icin mail adresini girer")
    public void kullaniciLoginIcinMailAdresiniGirer() {
       login.login_username.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("Kullanici password girer")
    public void kullaniciPasswordGirer() {
        login.login_password.sendKeys(ConfigReader.getProperty("password"));

    }

    @And("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        login.login_button.click();
    }

    @And("Kullanici login olunabildigini dogrular")
    public void kullaniciLoginOlunabildiginiDogrular() {
        page.register_myAccount.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("My account"));
//        WebElement loginNameExpected=login.login_Hallo;
//        String newLoginName=loginNameExpected.getText();
//        tumSayfaResmi(newLoginName);
//        Assert.assertTrue(newLoginName.contains("Hallo"));

    }

    @And("Kullanici login negatif test icin gecersiz senaryo olusturur  {string},{string}")
    public void kullaniciLoginNegatifTestIcinGecersizSenaryoOlusturur(String Email, String password) {
        login.login_username.sendKeys(Email);
        login.login_password.sendKeys(password);
        bekle(1);
        login.login_button.click();
        bekle(2);



    }

    @And("Kullanici negatif senaryolarda login olunamadigini dogrular")
    public void kullaniciNegatifSenaryolardaLoginOlunamadiginiDogrular() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("My account"));
    }
}
