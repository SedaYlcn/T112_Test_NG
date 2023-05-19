package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroWebAppPage {


    public ZeroWebAppPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (id = "signin_button")
    public WebElement signingButton;

   @FindBy (id="user_login")
    public WebElement usernameBox;

   @FindBy (id="user_password")
    public WebElement passwordBox;

   @FindBy (xpath ="//input[@type='submit']")
    public WebElement submitButton;

   @FindBy(id="onlineBankingMenu")
    public WebElement onlineBankingElement;

   @FindBy(id="pay_bills_link")
    public WebElement payBillsLink;

   @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyButton;

   @FindBy (id="pc_currency")
    public  WebElement currencyDropDown;


}
