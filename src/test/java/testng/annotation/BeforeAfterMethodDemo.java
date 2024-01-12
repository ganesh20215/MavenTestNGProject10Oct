package testng.annotation;

import org.testng.annotations.*;

public class BeforeAfterMethodDemo {

    @BeforeClass
    public void beforeClassEx(){
        System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethodEx(){
        System.out.println("Before Method");
    }

    @Test
    public void testCase1(){
        System.out.println("test Case 1");
    }

    @Test(groups = {"smoke"})
    public void testCase2(){
        System.out.println("test Case 2");
    }

    @Test
    public void testCase3(){
        System.out.println("test Case 3");
    }

    @Test(groups = {"smoke"})
    public void testCase4(){
        System.out.println("test Case 4");
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
