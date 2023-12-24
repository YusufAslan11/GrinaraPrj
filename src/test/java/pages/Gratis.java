package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Gratis {
    public Gratis() {
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(xpath = "//*[text()=\"Giriş Yap\"]")
    public WebElement enter;
    @FindBy(xpath = "//*[text()=\"Hesabım\"]")
    public WebElement myAccount;
    @FindBy(linkText ="my-account/mynotification")
    public WebElement myNotification;
    @FindBy(xpath = "//*[text()=\"Bildiriminiz bulunmuyor.\"]")
    public WebElement notifications;

    @FindBy(linkText = "https://www.facebook.com/Gratis/")
    public WebElement facebook;
    @FindBy(linkText = "https://www.instagram.com/gratistr/")
    public WebElement instagram;
    @FindBy(linkText = "https://www.twitter.com/gratistr/")
    public WebElement twitter;
    @FindBy(linkText = "https://www.youtube.com/gratistr/")
    public WebElement youtube;



}
