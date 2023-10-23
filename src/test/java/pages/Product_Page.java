package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Product_Page {
    public Product_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "menu-item-12603")
    public WebElement prod_shop;

    @FindBy(xpath = "//div[@data-id='15014']")
    public WebElement urunX;

    @FindBy(xpath = "//div[@data-title='2000 Watt']")
    public WebElement tripod;

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepet;

@FindBy(xpath = "//*[@class='wd-header-cart wd-tools-element wd-design-7 cart-widget-opener wd-style-text whb-eyi35wj5v52my2hec8de']")
    public WebElement sepetGir;

@FindBy(xpath = "//a[@class='cart-item-link wd-fill']")
    public WebElement sepetteUrun;

}
