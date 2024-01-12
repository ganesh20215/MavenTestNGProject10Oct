package testng.testngattribute.invication;

import org.testng.annotations.Test;

public class InnocationCountExample {

    @Test(invocationCount = 1000, invocationTimeOut = 1000)
    public void testCaseExample() {
        System.out.println("Hello");
    }
}
