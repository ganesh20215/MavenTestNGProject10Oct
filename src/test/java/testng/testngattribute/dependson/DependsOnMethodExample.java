package testng.testngattribute.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyFundsTransfer() {
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyFindATMOption() {
        System.out.println("Verify Find ATM Option..");
    }
}
