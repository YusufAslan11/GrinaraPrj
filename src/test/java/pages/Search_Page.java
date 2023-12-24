package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Search_Page {
    public Search_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Produktsuche\"][1]")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class=\"searchsubmit\"][1]")
    public WebElement searchButton;

    @FindBy(className = "products elements-grid wd-products-holder  wd-spacing-20 grid-columns-4 pagination-pagination title-line-two wd-stretch-cont-lg align-items-start wd-products-with-bg row")
    public WebElement biofactur;
}