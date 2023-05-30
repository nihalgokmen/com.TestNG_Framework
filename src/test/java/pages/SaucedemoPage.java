package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "user-name")
    public WebElement userName;
    @FindBy(id ="password")
    public WebElement password;
    @FindBy(id="login-button")
    public WebElement submit;

    @FindBy(className = "product_sort_container")
    public WebElement dropDown;


}
