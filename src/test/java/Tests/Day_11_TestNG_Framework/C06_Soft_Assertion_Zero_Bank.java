package Tests.Day_11_TestNG_Framework;

import Pages.ZeroWebAppPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.util.*;

public class C06_Soft_Assertion_Zero_Bank {

    @Test
    public void test01(){
        ZeroWebAppPage zeroWebAppPage = new ZeroWebAppPage();

        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get("http://zero.webappsecurity.com/");

        //2. Sign in butonuna basin
        ;
        zeroWebAppPage.signingButton.click();

        //3. Login kutusuna “username” yazin
        zeroWebAppPage.usernameBox.sendKeys("username");

        //4. Password kutusuna “password” yazin
        zeroWebAppPage.passwordBox.sendKeys("password");

        //5. Sign in tusuna basin
        zeroWebAppPage.submitButton.click();

        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        zeroWebAppPage.onlineBankingElement.click();
        zeroWebAppPage.payBillsLink.click();

        //7. “Purchase Foreign Currency” tusuna basin
        zeroWebAppPage.purchaseForeignCurrencyButton.click();

        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zeroWebAppPage.currencyDropDown);
        select.selectByVisibleText("Eurozone (euro)");

        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();

        String actualDropDown = select.getFirstSelectedOption().getText();
        String expectedDropDown = "Eurozone (euro)";

        Assert.assertEquals(actualDropDown, expectedDropDown, "Eurozone Secim");


        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)
        List<WebElement> optionsElementList = select.getOptions();
        List<String> actualOptionListStr = new ArrayList<>();

        for (WebElement each:optionsElementList
             ) {
            actualOptionListStr.add(each.getText());
        }

        String[] arr = {"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
                        "China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)",
                        "Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)",
                        "Sweden (krona)","Singapore (dollar)","Thailand (baht)" };
        List<String> expectedOptionList = Arrays.asList(arr);

        Collections.sort(actualOptionListStr);
        Collections.sort(expectedOptionList);

        softAssert.assertEquals(actualOptionListStr, expectedOptionList);

      ReusableMethods.wait(3);
      softAssert.assertAll();
      Driver.closeDriver();
    }

}
