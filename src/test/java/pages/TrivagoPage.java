package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrivagoPage {

    public TrivagoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[@class='font-bold block py-3 px-6 truncate h-full cursor-pointer text-m text-grey-900 border-grey-900 border-b-2']")
    public WebElement tumKonaklamalarYazisi;

    @FindBy(id = "input-auto-complete")
    public WebElement gidilecekYer;

    @FindBy(xpath = "//span[@data-testid='search-form-calendar-checkin-label']")
    public WebElement girisButonu;

    @FindBy(xpath = "//time[@datetime='2023-06-05']")
    public WebElement girisTarihi;

    @FindBy(xpath = "//span[@data-testid='search-form-calendar-checkout-label']")
    public WebElement cikisButonu;

    @FindBy(xpath = "//time[@datetime='2023-06-09']")
    public WebElement cikisTarihi;

    @FindBy(xpath = "//span[@data-testid='search-form-guest-selector-value']")
    public WebElement misafirlerOdalar;

    @FindBy(xpath = "(//span[@aria-hidden='true'])[5]")
    public WebElement yetiskinSayisiButonu;

    @FindBy(id= "checkbox-13")
    public WebElement evcilHayvanButonu;

    @FindBy(xpath = "//button[@data-testid='guest-selector-apply']")
    public WebElement uygulaButonu;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement araButonu8;

    @FindBy(xpath = "//span[@data-testid='loading-animation-accommodations-counter']")
    public WebElement bulunanKonaklamalar;


}
