package Tests.Day10_TestNG_Framework;

import org.testng.annotations.*;

public class C03_Before_After_Test_Notations {


    /*
    Test Cesitleri:
     - Smoke Test
     - Regression Test
     - EndtoEnd (E2E)

    TEST: bir amac icin bir araya getirilmis test method`lari class`lari ve/veya package`lari icerir.

    TEST SUITE : Birden fazla Test`in bir amac icin bir araya getirilmesidir.

    Test Hiyerarsisi:
    - Suite
    - Test
    - Groups, packages, classes, methods

    */

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Before Suit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Before Method");
    }

    @Test
    public void test01() {
        System.out.println("Test01");
    }

    @Test
    public void test02() {
        System.out.println("Test02");
    }

    @Test
    public void test03() {
        System.out.println("Test03");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("After Suit");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }



}