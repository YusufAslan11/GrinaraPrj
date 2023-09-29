package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Login_Page;
import pages.Register_Page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.click;

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
         //click(page.register_myAccount2);
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
    @Then("Kullanici kayit oldugunu gorur")
    public void kullanici_kayit_oldugunu_gorur() {

        String text=page.register_text.toString();
        System.out.println(text);
        Assert.assertTrue(text.contains("Hallo"));

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
}
