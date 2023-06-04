package tests.day15_POM;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_QualitydemyLoginTest {

    @Test(groups = "smoke")
    public void qualitydemi(){

        // Qualitydemy ana sayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        // login butonuna basin
        qualitydemyPage.loginButton.click();

        // basarili olarak giris yapildigini test edin ve sayfayi kapatin
        qualitydemyPage.basariliGirisKontrol.isDisplayed();
        Driver.closeDriver();
    }
}
