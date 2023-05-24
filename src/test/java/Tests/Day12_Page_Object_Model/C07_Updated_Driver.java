package Tests.Day12_Page_Object_Model;

import Utilities.ConfigReader;
import Utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C07_Updated_Driver {

    @Test
    public void amazonTest(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        String expectedIcerik ="amazon";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedIcerik));
        Driver.closeDriver();

    }
    @Test
    public void wiseTest(){

        Driver.getDriver().get(ConfigReader.getProperty("wiseURL"));
        String expectedIcerik = "wisequarter";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedIcerik));
        Driver.closeDriver();

    }

    @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("faceURL"));
        String expectedIcerik = "facebook";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedIcerik));
        Driver.closeDriver();


    }

}
