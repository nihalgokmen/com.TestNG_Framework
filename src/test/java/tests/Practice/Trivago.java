package tests.Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TrivagoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Trivago {
    @Test
    public void test01() {
        // Kullanici Trivago ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("trivagoUrl"));

        // 1 Kullanicinin anasayfada rezervasyon cubugunda "tum konaklamalar" butonuna tiklar
        TrivagoPage trivagoPage = new TrivagoPage();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(trivagoPage.tumKonaklamalarYazisi.isEnabled());
        trivagoPage.tumKonaklamalarYazisi.click();

        // 2 Gidilecek yer butonuna tiklar
        softAssert.assertTrue(trivagoPage.gidilecekYer.isEnabled());
        trivagoPage.gidilecekYer.click();

        //3 Gidilecek yer butonuna gitmek istedigi yeri yazar
        trivagoPage.gidilecekYer.sendKeys("Antalya");

        //4 Kullanici giris butonuna tiklar ve gidecegi tarihi secer



        //5 Kullanici cikis butonuna tiklar ve donecegi tarihi secer

        //6 Kullanici misafirler ve oda butonuna tiklar ve Yetiskinler icin eksi(-) butonuna basarak kisi sayisini 1'e dusurur

        //7 Evcil hayvan ve uygula butonuna tiklar

        //8 Ara butonuna tiklar

        //9 Bulunan konaklamalar sayisinin 31 oldugunu test eder
    }
}
