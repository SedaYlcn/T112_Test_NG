package Tests.Day11_TestNG_Framework;

import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Priority {

    /* TestNG test methodlarini calistirirken standart olarak harf siralamasini dikkate alir.

    Ancak TestNG siralamayi bizim kontrol etmenize olanak tanir. Istedigimiz test methoduna, istedigimiz onceligi
    priority ile tanimlayabiliriz. Selenium test methodlari priority`si kucukten buyuge dogru calistirir.

     Eger iki testin priority`si ayni ise harf sirasina gore test calistirir. Priority deger atanmaz ise default olarak
     0 atanir. Negatif degerler de once calisir.


     */

    @Test (groups = "smoke")
    public void amazonTest(){
        // Amazon ana sayfasina gidip, gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");

        // url amazon iceriyor mu test edelim
        String expectedWord = "amazon";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedWord));

        Driver.closeDriver();
    }
    @Test (priority = 5)
    public void wiseTest(){
        // Wisequarter ana sayfasina gidip, gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");

        // url amazon iceriyor mu test edelim
        String expectedWord = "wisequarter";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedWord));

        Driver.closeDriver();


    }

    @Test (groups = {"smoke" , "minireg1"})
    public void youtubeTest(){
        // Youtube ana sayfasina gidip, gittigimizi test edelim

        Driver.getDriver().get("https://www.youtube.com");

        // url amazon iceriyor mu test edelim
        String expectedWord = "youtube";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedWord));

        Driver.closeDriver();

    }



}
