package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@id='username']")
    public WebElement login_username;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement login_password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login_button;



}
