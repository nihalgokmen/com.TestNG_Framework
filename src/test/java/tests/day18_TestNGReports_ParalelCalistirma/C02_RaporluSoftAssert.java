package tests.day18_TestNGReports_ParalelCalistirma;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluSoftAssert extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Alert Test",
                                             "kullanici JS alertleri calistirabilmeli ve kapatabilmeli");

        // 1. Test
        //            -  https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        extentTest.info("Kullanici herokuapp alerts sayfasina gider");

        //            - 1.alert'e tiklayin
        Thread.sleep(3000);
        WebElement ilkAlertElement = Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ilkAlertElement.click();
        extentTest.info("Ilk alert butonuna click yapar");

        //            -  Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        Thread.sleep(3000);

        String expectedAlertYazisi = "I am a JS Alert";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();

        SoftAssert softAssert = new SoftAssert();
        //Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        softAssert.assertEquals(actualAlertYazisi,expectedAlertYazisi,"alert'teki yazi belirlenenden farkli");
        extentTest.info("Softassert ile alert yazisinin beklenen degere sahip oldugunu test eder");

        //            -  OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alert'i kapatir");
        // alert'in kapatildigini test edin

        // Assert.assertTrue(ilkAlertElement.isEnabled());
        softAssert.assertTrue(ilkAlertElement.isEnabled(),"alert kapatilamadi");
        extentTest.info("Softassert ile alert'in kapatildigini test eder");

        softAssert.assertAll();
        extentTest.pass("Softassert ile yapilan tum testlerin sonucunu raporlar");
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
