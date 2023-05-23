package Tests.Day12_Page_Object_Model;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class C04_Configuration_File_Use {

    /*

    POM`de hedef test class`indan manuel olarak hic bir test datasi GIRMEMEKTIR.

    Test Datalari:
    1 - Kullanacagimiz WebDriver : Driver class`indan dinamik olarak kullaniliyor
    2 - Locate : Locate`ler pages sayfasindan dinamik olarak kullaniliyor.
    3 - Kullanilan URL, aranan kelime, expected icerik, dogru kullanici adi, yanlis kullanici adi, sifre vs. gibi datalar.
        Bu datalar string mantigi ile tutabiliriz.

     */

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String expectedIcerik = ConfigReader.getProperty("amazonExpectedKelime");
        String actualSonucYazisi = amazonPage.searchResultElement.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();

    }
}
