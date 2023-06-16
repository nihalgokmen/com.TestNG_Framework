package tests.Practice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class P01 {
    /*
        - Birbirine bağımlı testler oluşturun.
        - beforeClass oluşturup setUp ayarlarini yapin.
        - Birbirine bağımlı testler oluşturarak
        - ilk once wisequarte'a gidin
        - sonra wisequarte'a bağımlı olarak youtube'a gidin
        - daha sonra youtube'a bağımlı olarak amazon' a gidin
        - driver'i kapatın.
     */

    @Test
    public void wise(){

        // ilk once wisequarte'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }

    @Test (dependsOnMethods = "wise")
    public void youtube(){
        // sonra wisequarte'a bağımlı olarak youtube'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }

    @Test (dependsOnMethods = "youtube")
    public void amazon(){
        // daha sonra youtube'a bağımlı olarak amazon' a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }

}
