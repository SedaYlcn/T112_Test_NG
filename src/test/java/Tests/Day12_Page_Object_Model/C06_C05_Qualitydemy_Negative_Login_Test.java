package Tests.Day12_Page_Object_Model;

import Pages.QualityDemyPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class C06_C05_Qualitydemy_Negative_Login_Test {

    @Test
    public void test01(){

        // 1 - go to the "https://www.qualitydemy.com/"
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));

        // 2 - click login button
        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        qualityDemyPage.logInElementFirst.click();

        //  3 -Enter a valid email and password
        qualityDemyPage.userEmailBox.sendKeys(ConfigReader.getProperty("qdGecersizUsername")+ Keys.ENTER);
        qualityDemyPage.userPasswordBox.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        // 4 - Enter Login
        qualityDemyPage.LogInElementSecond.submit();

        // 6 - Control if it is successful entry
        Assert.assertTrue(qualityDemyPage.userEmailBox.isEnabled());

        // 7- Close the page

        Driver.closeDriver();



    }


}
