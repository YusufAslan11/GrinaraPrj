package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Login_Page;
import pages.Product_Page;
import pages.Register_Page;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.List;
import static utilities.ReusableMethods.*;


public class MyStepdefs {

    Register_Page page=new Register_Page();
    Login_Page login=new Login_Page();
    Product_Page prod=new Product_Page();
    Faker fake=new Faker();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String Grinara_Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Grinara_Url));
        bekle(7);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    @Then("Kullanici account butonuna basar")
    public void kullanici_account_butonuna_basar() {


        click(page.register_myAccount);

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
        click(page.register_myAccount);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("My account"));


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
        bekle(3);
        Assert.assertFalse(Driver.getDriver().getTitle().contains("My account"));
    }

    //Product Section
    @Given("Kullanici shop sekmesini acar")
    public void kullanici_shop_sekmesini_acar() {
        prod.prod_shop.click();
        bekle(3);

    }
    @Then("Kullanici begendigi bir urunu secer")
    public void kullanici_begendigi_bir_urunu_secer() {
       List<WebElement> pro= Driver.getDriver().findElements(By.xpath("//h3[@class='wd-entities-title']"));
        for (WebElement webElement : pro) {
            System.out.println(webElement.getText());
        }
        scroll(prod.urunX);

        prod.urunX.click();

    }
    @Then("Kullanici sectigi urun sayfasinda oldugunu dogrular")
    public void kullanici_sectigi_urun_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ICQN"));
    }

    @Then("Kullanici urun seceneklerininden secim yapar")
    public void kullanici_urun_seceneklerininden_secim_yapar() {
        prod.tripod.click();
    }

    @Then("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {

        prod.sepet.click();

    }
    @Then("Kullanici sepete urunun eklendigini dogrular")
    public void kullanici_sepete_urunun_eklendigini_dogrular() {
        prod.sepetGir.click();
        Assert.assertTrue(prod.sepetteUrun.isDisplayed());

    }

}
