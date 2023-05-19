package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//button[@title='Allow all cookies']")
    public WebElement cookiesAccept;


    @FindBy (xpath = "//input[@placeholder='Email address or phone number']")
    public WebElement emailAddressBox;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement loginError;


}

