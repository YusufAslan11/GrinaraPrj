package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Categories_Page {
    public Categories_Page() {PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='All Categories']")
    public WebElement categories;

}
