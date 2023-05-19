package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualityDemyPage {

    public QualityDemyPage (){

        PageFactory.initElements(Driver.getDriver(), this);

    }

   @FindBy (id="cookieConsentContainer")
    public WebElement cookieAccept;

   @FindBy (xpath = "//*[text()='Log in']")
   public  WebElement logInElementFirst;

   @FindBy (id="login-email")
    public WebElement userEmailBox;

    @FindBy (id="login-password")
    public WebElement userPasswordBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement LogInElementSecond;

}
