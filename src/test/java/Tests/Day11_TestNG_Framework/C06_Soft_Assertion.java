package Tests.Day11_TestNG_Framework;

import Pages.AmazonPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C06_Soft_Assertion {
    /*
    If we want to use soft assertion, we need to create an object of SoftAssertion class.

    Soft assertion  kullanirken mesaj eklemek iyi olabilir.
    Olumsuz yani hangi test fail oldugunu gostermiyor, assertAll icin hata veriyor.

    Soft Assert obje uzerinden calisir... Static degildir.
    Assert.assertTrue() seklinde ki hard assert ise class uzerinden static method cagirarak calisir.

    Test case`in nerede Fail oldugunu hemen anlamak ve kod`a direk mudahele etmek istenirse hard assertion tercih edilebilir.

     */



    @Test
    public void test01(){

        // 1 - Amazon ana sayfasina gidin
        Driver.getDriver().get("https://wwww.amazon.com");

        // 2 - Amazon ana sayfasinda oldugunuzu dogrulayin
        SoftAssert softAssert = new SoftAssert();

        String expectedURLWord = "amazon";
        String actualURL = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualURL.contains(expectedURLWord));

        // 3 - Nutella aratin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);

        // 4 - Arama sonuclarinin nutella icerdigini dogrulayin
        String searchResult = amazonPage.searchResultElement.getText();
        softAssert.assertTrue(searchResult.contains("Nutella"));

        // 5 - Java aratin
        ReusableMethods.wait(10);
        amazonPage.searchBox.clear();
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);

        // 6 - Aramasonuclarinin 1000`den fazla oldugunu dogrulayin
        //System.out.println(amazonPage.searchResultElement.getText());

        searchResult = amazonPage.searchResultElement.getText();
        String[] resultarr = searchResult.split(" ");
        //System.out.println(Arrays.toString(resultarr));

        String javaResultStr = resultarr[3]; //3,000
        javaResultStr=javaResultStr.replaceAll("\\W",""); //3000


        int resultInt = Integer.parseInt(javaResultStr);

        softAssert.assertTrue(resultInt>1000);


        softAssert.assertAll();
        Driver.closeDriver();




//        SoftAssert softAssert = new SoftAssert();
//
//        Assert.assertTrue(6>10);
//        System.out.println("After First Assertion");
//
//        Assert.assertTrue(6>9);
//        System.out.println("After Second Assertion");
//
//        Assert.assertEquals(6, 7);
//        System.out.println("After Third Assertion");
//
//        softAssert.assertAll();
//        System.out.println("After assertALL method");


    }

}
