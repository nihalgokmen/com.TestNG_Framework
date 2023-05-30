package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class AmazonPage {

    // page class'lari surekli kullandigimiz locate islemleri
    // ve varsa login gibi kucuk islevleri iceren methodlar barindirir
    // Selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde
    // WebDriver objesine ihtiyac vardir

    // POM'de Driver class'inda olusturdugmuz
    // WebDriver driver objesini page class'larina tanimlamak icin
    // PageFactory class'indan initElements() kullanilir

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        // bu ayari constructor icine koyma sebebimiz :
        // page sayfalarina obje olusturularak ulasildigi icin
        // kim page sayfasini kullanmak isterse
        // page sayfasindan obje olusturmak icin, constructor calisacak
        // ve bu constructor'in icinde bulunan initElements() gerekli ayari yapmis olacak
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaCubugu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucYazisi;


}
