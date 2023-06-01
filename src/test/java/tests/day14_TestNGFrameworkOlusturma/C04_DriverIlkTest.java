package tests.day14_TestNGFrameworkOlusturma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlkTest {

    /*
        POM (page object model) driver olusturmak icin
        inheritance ile kullandigimiz TestBase class'i yerine
        static yollarla ulasabilecegimiz bir method kullanilmasi tercih edilmistir.

        Driver bizim icin cok onemli oldugundan
        Driver icin bagimsiz bir class olusturacagiz

     */

    @Test
    public void test01(){

        // amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");


        // Nutella icin arama yapin
        WebElement aramaCubugu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaCubugu.sendKeys("Nutella" + Keys.ENTER);

        // Arama sonuclarinin Nutella kelimesi icerdigini test edin
        WebElement sonucElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        String expected = "Nutella";
        String actual = sonucElementi.getText();

        Assert.assertTrue(actual.contains(expected));

        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
