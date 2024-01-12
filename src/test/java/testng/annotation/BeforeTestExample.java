package testng.annotation;

import org.testng.annotations.*;

public class BeforeTestExample extends BeforeSuiteExample{

    @BeforeClass
    public void beforeClassEx(){
        System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethodEx(){
        System.out.println("Before Method");
    }

    @BeforeTest
    public void beforeTestEx(){
        System.out.println("Before Test Example");
    }
    @AfterTest
    public void AfterTestEx(){
        System.out.println("After Test Example");
    }

    @Test
    public void testingMethod1() {
        System.out.println("Testing Method 1");
    }

    @Test
    public void testingMethod2() {
        System.out.println("Testing Method 2");
    }

    @AfterMethod
    public void afterMethodEx(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassEx(){
        System.out.println("After Class Method");
    }
}
