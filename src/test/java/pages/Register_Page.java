package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register_Page {
    public Register_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//  @FindBy(linkText = "https://grinara.de/my-account/")
//    public WebElement register_myAccount;
//
//    @FindBy(xpath = "//span[@class='wd-tools-text']")
//    public WebElement register_myAccount1;
//
//    @FindBy(xpath = "//span[@class='wd-tools-icon")
//    public WebElement register_myAccount2;
    @FindBy(xpath = "/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a/span[1]")
    public WebElement register_myAccount;

@FindBy(xpath = "//a[@class='btn btn-style-link btn-color-primary create-account-button']")
    public WebElement register_register;
@FindBy(xpath = "//input[@id='reg_email']")
    public WebElement register_email;
@FindBy(xpath = "//button[@value='Registrieren']")
    public WebElement register_verify;
@FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    public WebElement register_text;

}

