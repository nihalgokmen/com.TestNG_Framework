package tests.day15_POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_QualitydemyNegatifLoginTest {

    @Test
    public void test01(){
        // Qualitydemy ana sayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");

        // ilk login linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // kullanici adi olarak selenium girin
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password olarak heyecandir girin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");

        // longin butonuna tiklayin

        qualitydemyPage.loginButton.submit();

        // giris yapilmadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayi kapatin
        Driver.closeDriver();
    }

}
