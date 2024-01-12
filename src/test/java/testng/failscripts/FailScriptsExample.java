package testng.failscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptsExample {

   @Test
    public void testMethod_1() {
        System.out.println("This is test Method 1");
        Assert.assertTrue(true);
    }

   @Test
    public void testMethod_2() {
        System.out.println("This is test Method 2");
        Assert.assertTrue(true);
    }

   @Test
    public void testMethod_3() {
        Assert.assertTrue(false);
        System.out.println("This is test Method 3");
    }

   @Test
    public void testMethod_4() {
        Assert.assertTrue(false);
        System.out.println("This is test Method 4");
    }

   @Test
    public void testMethod_5() {
        Assert.assertTrue(true);
        System.out.println("This is test Method 5");
    }
}
