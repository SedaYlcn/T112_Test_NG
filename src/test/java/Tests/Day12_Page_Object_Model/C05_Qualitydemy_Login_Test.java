package Tests.Day12_Page_Object_Model;

import Pages.QualityDemyPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class C05_Qualitydemy_Login_Test {

    @Test
    public void Test01(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();

        // 1 - Qualitydemy ana sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));

        // 2 - click login button
        qualityDemyPage.logInElementFirst.click();

        //  3 -Enter a valid email and Enter a valid password
        qualityDemyPage.userEmailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername")+ Keys.ENTER);
        qualityDemyPage.userPasswordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword")+Keys.ENTER);

        // 5 - Enter Login
        qualityDemyPage.LogInElementSecond.submit();

        // 6 - Control if it is successful entry
        Assert.assertTrue(qualityDemyPage.entryControl.isDisplayed());


        // 7- Close the page

        Driver.closeDriver();

    }

}
