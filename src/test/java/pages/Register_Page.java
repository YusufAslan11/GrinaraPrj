package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register_Page {
    public Register_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[@title='Mein Konto']")
public WebElement register_myAccount;

@FindBy(xpath = "//a[@class='btn wd-switch-to-register']")
    public WebElement register_register;


@FindBy(xpath = "//input[@id='reg_email']")
    public WebElement register_email;
@FindBy(xpath = "//button[@value='Registrieren']")
    public WebElement register_verify;
@FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    public WebElement register_text;

@FindBy(className = "edit-account-link")
    public WebElement edit_account;

@FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    public WebElement registerMessage;

@FindBy(xpath = "//*[text()=\"Failed attempts count:\"]")
    public WebElement failed;

@FindBy(xpath = "//button[@class='cky-btn cky-btn-accept']")
    public WebElement acceptMsg;




}

