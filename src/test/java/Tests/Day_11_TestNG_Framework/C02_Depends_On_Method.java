package Tests.Day_11_TestNG_Framework;

import Pages.AmazonPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Depends_On_Method {

    /*
    priority oncelik belirler ama testleri birbirine baglamaz. Eger bir test method`unun calismasi baska bir test
    method`una bagli ise bu durumda dependsOnMethods kullanmaliyiz.

    dependsOnMethods ile baska bir method`a bagli olan method`u bagimsiz calistirmak istercek once bagli oldugu metho`u
    calistirir, sonra kendisi calisir. Sadece 2 method icin gecerlirdir, 3 method calismaz.

    dependsOnMethods sirayi belirlemez, yani hangi testin once calisacagini belirlemez. Sira bagli olan method`a geldiginde
    oncelikle bagli oldugu method`un calismasini ve PASSED olmasini bekler.

    Eger bagli olunan method FAILED olursa, bagli olan method calistirilmaz, ignore edilir.


     */


    // 3 test method olusturun.
    // 1. Test`te amazon gittigimizi test edin
    // 2. Test`te Nutella aratip sonucun Nutella icerdigini test edin
    // 3. Test`te ilk urune click yapip, urun isminin Nutella oldugunu test edin

    AmazonPage amazonPage = new AmazonPage(); // Bu objeyi her test kullanabilsin diye class level tasiyoruz.

    @Test (priority = 1)
    public void amazonTest(){

        Driver.getDriver().get("https://www.amazon.com");

        String expectedWord = "amazon";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedWord));


    }

    @Test (dependsOnMethods = "amazonTest")
    public void nutellaTest(){


        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER); // amazonPage'den obje'yi kullanip arama kutusuna
        String expectedResult = "Nutella";
        String actualResult = amazonPage.searchResultElement.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));

    }

   @Test (dependsOnMethods ="nutellaTest")
    public void ilkUrunTest(){

        amazonPage.theFirstItem.click();

        String expectedWord = "Nutella";
        String actualName = amazonPage.theFirstItemNameElement.getText();

        Assert.assertTrue(actualName.contains(expectedWord));

        Driver.closeDriver();



   }


}
