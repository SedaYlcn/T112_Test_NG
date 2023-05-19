package Tests.Day10_TestNG_Framework;

import Pages.QualityDemyPage;
import Pages.ZeroWebAppPage;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C07_Positive_Login_Test {

    @Test
    public void test01(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();

        // 1 - go to the "https://www.qualitydemy.com/"
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualityDemyPage.cookieAccept.click();

        // 2 - click login button
        qualityDemyPage.logInElementFirst.click();

        //  3 -Enter a valid email (a@a.com)
        qualityDemyPage.userEmailBox.sendKeys("a@a.com");

        //  4- Enter a valid password
        qualityDemyPage.userPasswordBox.sendKeys("123123123");

        // 5 - Enter Login
        qualityDemyPage.LogInElementSecond.click();

    }
}
