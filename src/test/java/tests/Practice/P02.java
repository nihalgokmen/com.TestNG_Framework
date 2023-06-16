package tests.Practice;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P02 {

    /*
        Navigate to https://www.saucedemo.com/
        Enter the username as standard_user
        Enter the password as secret_sauce
        Click on login button
        Test 1: Choose price Iow to high
        Test 2: Verify item prices are sorted from Iow to high with soft Assert
    */

    @Test
    public void saucedemo(){
        // Navigate to https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        // Enter the username as standard_user
        SaucedemoPage saucedemoPage = new SaucedemoPage();
        saucedemoPage.userName.sendKeys(ConfigReader.getProperty("sdUsername"));

        // Enter the password as secret_sauce
        saucedemoPage.password.sendKeys(ConfigReader.getProperty("sdPassword"));

        // Click on login button
        saucedemoPage.submit.click();

        Select select = new Select(saucedemoPage.dropDown);
        select.selectByVisibleText("Price (low to high)");

        Driver.closeDriver();

    }



}
