package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;


import static utilities.ReusableMethods.*;


public class StepDefinitions {

    Register_Page page = new Register_Page();
    Login_Page login = new Login_Page();
    Product_Page prod = new Product_Page();
    SearchProduct_Page search = new SearchProduct_Page();

    Categories_Page cat =new Categories_Page();

    Faker fake = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    String registerMail;
    String userName;


    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String Grinara_Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Grinara_Url));
        bekle(3);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    @Then("Kullanici account butonuna basar")
    public void kullanici_account_butonuna_basar() {
        click(page.register_myAccount);
        bekle(2);


    }

    @Then("Kullanici register sekmesine tiklar")
    public void kullanici_register_sekmesine_tiklar() {


        click(page.acceptMsg);
        bekle(2);

        click(page.register_register);
        bekle(2);

    }

    @Then("Kullanici mail adresini girer")
    public void kullanici_mail_adresini_girer() {


       // page.register_email.sendKeys(fake.internet().emailAddress());
        registerMail = fake.internet().emailAddress();
        page.register_email.sendKeys(registerMail);
        String[] splitMail = registerMail.split("@");
        userName = splitMail[0];

    }

    @Then("Kullanici register butonuna basar")
    public void kullanici_register_butonuna_basar() {
        click(page.register_verify);
        bekle(2);

    }

    @Then("Kullanici register isleminin basarili oldugunu dogrular")
    public void kullanici_register_isleminin_basarili_oldugunu_dogrular() {
        tumSayfaResmi("Registered");
        String registerMsg = page.registerMessage.getText();
        System.out.println(registerMsg);
        System.out.println(userName);

      //  Assert.assertTrue(registerMsg.contains(userName));


    }

    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

        Driver.closeDriver();

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
        Assert.assertTrue(page.failed.isDisplayed());

    }

    //Product Section
    @Given("Kullanici shop sekmesini acar")
    public void kullanici_shop_sekmesini_acar() {
        prod.prod_shop.click();
        bekle(3);

    }

    @Then("Kullanici begendigi bir urunu secer")
    public void kullanici_begendigi_bir_urunu_secer() {
        List<WebElement> pro = Driver.getDriver().findElements(By.xpath("//h3[@class='wd-entities-title']"));
        for (WebElement webElement : pro) {
            System.out.println(webElement.getText());
        }
        scroll(prod.tripod);
        bekle(2);

        click(page.acceptMsg);
        bekle(2);
        click(prod.tripod);



    }

    @Then("Kullanici sectigi urun sayfasinda oldugunu dogrular")
    public void kullanici_sectigi_urun_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ICQN"));



    }

    @Then("Kullanici urun seceneklerinden secim yapar")
    public void kullanici_urun_seceneklerininden_secim_yapar() {




    }

    @Then("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
//        try {
//            page.acceptMsg.click();
//            bekle(2);
//            //  Block of code to try
//        }
//        catch(Exception e) {
//            System.out.println("Cookies bulunamadı");
//        }
//        try {
//            prod.tripod2.click();
//        }
//        catch(Exception e) {
//            System.out.println("Ürün bulunamadı");
//        }


        click(prod.buyProduct);

        bekle(2);


    }

    @Then("Kullanici sepete urunun eklendigini dogrular")
    public void kullanici_sepete_urunun_eklendigini_dogrular() {
        prod.sepetGir.click();
        //Assert.assertTrue(prod.sepetteUrun.isDisplayed());
        boolean var = prod.productList.isEmpty();
        Assert.assertFalse(var);
        tumSayfaResmi("AddedProduct");


    }

    @Then("Kullanici arama bolumunde {string} aratir")
    public void kullaniciAramaBolumundeAratir(String Pro) {
        search.searchBox.sendKeys(Pro);
        search.searchButton.click();
        bekle(3);
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @Then("Kullanici aranan urunlerin bulundugunu dogrular")
    public void kullaniciArananUrunlerinBulundugunuDogrular() {
        boolean isDisplayed = prod.findResult.isDisplayed();
        Assert.assertTrue(isDisplayed);
        webElementResmi(prod.findResult);
        tumSayfaResmi("ProductPicture");

        Driver.closeDriver();

    }

    @Then("Kullanici kategoriler sekmesini tiklar")
    public void kullanici_kategoriler_sekmesini_tiklar() {


    }
    @Then("Kullanici Oturma Odasi sekmesine tiklar")
    public void kullanici_oturma_odasi_sekmesine_tiklar() {

    }
    @Then("Oturma Odasi sekmesinin aktif oldugu dogrulanir")
    public void oturma_odasi_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Yatak Odasi sekmesine tiklar")
    public void kullanici_yatak_odasi_sekmesine_tiklar() {

    }
    @Then("Yatak Odasi sekmesinin aktif oldugu dogrulanir")
    public void yatak_odasi_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Mutfak sekmesine tiklar")
    public void kullanici_mutfak_sekmesine_tiklar() {

    }
    @Then("Mutfak sekmesinin aktif oldugu dogrulanir")
    public void mutfak_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Banyo sekmesine tiklar")
    public void kullanici_banyo_sekmesine_tiklar() {

    }
    @Then("Banyo sekmesinin aktif oldugu dogrulanir")
    public void banyo_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Acikhava ve Seyahat sekmesine tiklar")
    public void kullanici_acikhava_ve_seyahat_sekmesine_tiklar() {
      ;
    }
    @Then("Acikhava ve Seyahat sekmesinin aktif oldugu dogrulanir")
    public void acikhava_ve_seyahat_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Isitma Cihazlari sekmesine tiklar")
    public void kullanici_ısitma_cihazlari_sekmesine_tiklar() {

    }
    @Then("Isitma Cihazlari sekmesinin aktif oldugu dogrulanir")
    public void ısitma_cihazlari_sekmesinin_aktif_oldugu_dogrulanir() {

    }
    @Then("Kullanici Indirimler sekmesine tiklar")
    public void kullanici_ındirimler_sekmesine_tiklar() {

    }
    @Then("Indirimler sekmesinin aktif oldugu dogrulanir")
    public void ındirimler_sekmesinin_aktif_oldugu_dogrulanir() {

    }

}
