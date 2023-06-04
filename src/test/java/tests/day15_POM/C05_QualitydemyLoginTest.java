package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTest {

    @Test
    public void test01(){

        //Qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //log in linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        //gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qualitydemyPage.cookie.click();

        //login butonuna basarak
        qualitydemyPage.loginButton.submit();

        //basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrol.isDisplayed());

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
