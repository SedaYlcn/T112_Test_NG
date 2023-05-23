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

   @FindBy (xpath="//input[@name='email']")
    public WebElement userEmailBox;

    @FindBy (xpath="//input[@id='login-password']")
    public WebElement userPasswordBox;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement LogInElementSecond;

    @FindBy (xpath = "//a[text()='Instructor']")
    public WebElement entryControl;




}
