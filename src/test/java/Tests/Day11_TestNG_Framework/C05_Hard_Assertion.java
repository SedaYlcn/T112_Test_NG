package Tests.Day11_TestNG_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C05_Hard_Assertion {

    /*
          There are two type of assertion
     HARD ASSERTION : When we use hard assertion, code will be executed until the first failure (false assertion). At first
     failure system will stop and will not process the next line. On the console we will see the first failure`s line number.



     */



    @Test
    public void test01(){

        Assert.assertTrue(6>4);
        System.out.println("After First Assertion");

        Assert.assertTrue(6>14);
        System.out.println("After Second Assertion");

        Assert.assertEquals(6, 6);
        System.out.println("After Third Assertion");
    }




}
