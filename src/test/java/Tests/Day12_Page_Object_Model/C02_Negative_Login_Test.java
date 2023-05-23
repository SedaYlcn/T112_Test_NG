package Tests.Day12_Page_Object_Model;

import Pages.QualityDemyPage;
import Utilities.Driver;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_Negative_Login_Test {

     @Test
     public void test01(){

     // 1 - Qualitydemy anasayfasina gidin
      Driver.getDriver().get("https://www.qualitydemy.com/");

     // 2 - Ilk Login Link Tiklayin
     QualityDemyPage qualityDemyPage = new QualityDemyPage();

     qualityDemyPage.logInElementFirst.click();

     // 3 - Kullanici adi olarak selenium yazin
     qualityDemyPage.userEmailBox.sendKeys("selenium" + Keys.ENTER);

     // 4- password olarak heyecandir yazin
     qualityDemyPage.userPasswordBox.sendKeys("heyencan" + Keys.ENTER);

     // 5- Login butonuna tiklayin
     qualityDemyPage.LogInElementSecond.submit();

     // 6- Giris yapilamadigini test edin
     Assert.assertTrue(qualityDemyPage.userEmailBox.isEnabled());

   // 7 - Driver kapat
         Driver.closeDriver();

    }


}
