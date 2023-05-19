package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    /*
    Pages class`lari surekli kullanilan locate`leri tekrar tekrar locate etmek yerine kullanilir.

    Her pages class`i Driver Class`inda olusturulan driver`i kullanir.

    @FindBy notasyonunun driver class`inda ki webDriver`i kullanabilmesi icin bu class`a tanitmamiz gerekir. Bunun icin
    her pages sayfasi actigimiz da parametresiz bir constructor olusturup, icerisinden driver`i bu class`a tanitmaliyiz.

     */

    public AmazonPage(){ //parametresiz constructor
        PageFactory.initElements(Driver.getDriver(),this); // bu class`ta bu driver kullaniyoruz diye tanimliyoruz

    }
    @FindBy (xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement searchResultElement;

   @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement theFirstItem;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement theFirstItemNameElement;
}
