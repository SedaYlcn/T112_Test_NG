package Tests.Day12_Page_Object_Model;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C08_Singleton_Pattern {

    @Test
    public void test01(){
        /*
        Otomasyon icin en onemli nokta Driver class`inda ki webDriver driver objesini kullaniyoruz.
        Ancak driver`in bizim istedigimiz islemleri yapabilmesi icin oncelikler getDriver() icinde yaptigimiz atama
        islemlerine ihtiyaci var.

        Bir framerwork de calisan kisilerin getDriver() kullan,adam direk driver objesine erisimini engellemek icin
        Singleton Pattern kullanimi tercih edilmistir.

        Singleton Pattern bir Class`dan obje olusturulmasini ve o obje ile class`da ki class uyelerine erisimini engellemek
        icin kullanilir.

        OOP konsept cercevesinde Driver class`ini farkli farkli yontemlerle kullanabiliriz.(Parent Class edinilebilir etc.
        Ekip calismasinin tek duzen uzerinden devam etmesi icin farkli yontemlerle WebDriver driver`in kullanimi
        engellenmelidir.

         */

        // Driver.driver.get(ConfigReader.getProperty("amazonURL"));
        // getDriver() calismadigindan driver null olarak isaretlenir ve NullPointerException verir.

        // Driver driver = new Driver();
        // driver.get("https://www.amazon.com");

       //Driver Class`inda ki constructor`i private yaparak Driver class`indan obje olusturulmasini engelledik.




    }



}
