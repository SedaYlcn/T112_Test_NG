package Tests.Day12_Page_Object_Model;

import Pages.QualityDemyPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Positive_Login_Test {

    @Test
    public void test01(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();

        // 1 - go to the "https://www.qualitydemy.com/"
        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualityDemyPage.cookieAccept.click();

        // 2 - click login button
        qualityDemyPage.logInElementFirst.click();

        //  3 -Enter a valid email (a@a.com)
        qualityDemyPage.userEmailBox.sendKeys("anevzatcelik@gmail.com"+ Keys.ENTER);

        //  4- Enter a valid password
        qualityDemyPage.userPasswordBox.sendKeys("Nevzat152032"+ Keys.ENTER);

        // 5 - Enter Login
        qualityDemyPage.LogInElementSecond.submit();

        // 6 - Control if it is successful entry
        Assert.assertTrue(qualityDemyPage.entryControl.isDisplayed());


        // 7- Close the page

        Driver.closeDriver();

    }
}
