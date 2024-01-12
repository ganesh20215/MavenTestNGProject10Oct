package testng.testngattribute.dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = {"smoke"})
    public void verifyPerformDebitCardTransaction() {
        Assert.assertTrue(false);
        System.out.println("verify Perform Debit Card Transaction");
    }

    @Test(dependsOnGroups = {"smoke"}, alwaysRun = true)
    public void verifyBook12ThFailMovieTicket() {
        System.out.println("verify Book 12Th Fail Movie Ticket");
    }

    @Test(enabled = false)
    public void verifyPurchasePopCorn() {
        System.out.println("verify Purchase PopCorn");
    }

    @Test
    public void verifyPurchaseColdDrinks() {
        System.out.println("verify Purchase Cold Drinks");
    }
}
