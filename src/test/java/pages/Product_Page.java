package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Product_Page {
    public Product_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "menu-item-12603")
    public WebElement prod_shop;

    @FindBy(xpath = "//div[@data-id='15014']")
    public WebElement dysis2300;

    @FindBy(xpath = "//div[@data-id='24094']")
    public WebElement dysisInfrarot;

    @FindBy(xpath = "//a[text()='DYSIS Terrasse Infrarot Heizstrahler 2300 Watt']")
    public WebElement tripod;
    @FindBy(xpath = "//a[text()='DYSIS Low Glare Halogen Terrasse Infrarot Heizstrahler 2000 Watt']")
    public WebElement tripod2;


    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepet;
    @FindBy(xpath = "//button[@id='wd-add-to-cart']")
    public WebElement buyProduct;


    @FindBy(xpath = "//*[@class='wd-header-cart wd-tools-element wd-design-7 cart-widget-opener wd-style-text whb-eyi35wj5v52my2hec8de']")
    public WebElement sepetGir;

    @FindBy(xpath = "//h1[@class='entry-title title']")
    public WebElement findResult;


    @FindBy(xpath = "//*[@class=\"cart_list product_list_widget woocommerce-mini-cart \"]")
    public List<WebElement> productList;
    @FindBy(xpath = "//div[@data-source='main_loop']")
    public List<WebElement> productList1;
    @FindBy(xpath = "//a[@class='cart-item-link wd-fill']")
    public WebElement sepetteUrun;

}
