package Tests.Day12_Page_Object_Model;

import Pages.FacebookPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Facebook_Login {

    @Test
    public void facebookTest(){

        FacebookPage facebookPage = new FacebookPage();

    //1- https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://facebook.com/");

    //2-  Cookies kabul edin
       facebookPage.cookiesAccept.click();

    //3- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin


    //4- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker = new Faker();

        facebookPage.emailAddressBox.sendKeys(("abc" + faker.internet().emailAddress()));
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        ReusableMethods.wait(3);
        facebookPage.loginButton.click();

    //5- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.loginError.isDisplayed());

        ReusableMethods.wait(3);

    }
}
