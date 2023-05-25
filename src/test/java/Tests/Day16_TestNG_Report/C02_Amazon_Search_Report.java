package Tests.Day16_TestNG_Report;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseReport;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_Amazon_Search_Report extends TestBaseReport {

    @Test
    public void test01(){

        extentTest = extentReports.createTest("Amazon Search",
                                                "Kullanici Istedigi Kelimeyi Aratabilmeli");

        // amazon`a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        extentTest.info("Kullanici Amazon Sayfasina Gider");

        // Nutella icin arama yapin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+Keys.ENTER);
        extentTest.info("Kullanici Arama Kutusuna anahtar kelime yazar ve aratir.");


        // Arama sonuclarinin Nutella icerdigini test edin
        String expectedKelime = ConfigReader.getProperty("amazonExpectedKelime");
        String actualIcerik = amazonPage.searchResultElement.getText();

        Assert.assertTrue(actualIcerik.contains(expectedKelime));
        extentTest.pass("Belirlenen " +ConfigReader.getProperty("amazonAranacakKelime")+ " kelime aratilmasi sonucunda beklenen kelime bulundu.");

        Driver.closeDriver();

    }
}
