package testng.priority;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testCaseZ(){
        System.out.println("test Case Z");
    }

    @Test(priority = 2, groups = {"smoke"})
    public void testCaseM(){
        System.out.println("test Case M");
    }

    @Test(priority = -10)
    public void testCaseX(){
        System.out.println("test Case X");
    }

    @Test(priority = 'a')
    public void testCaseG(){
        System.out.println("test Case G");
    }

    @Test(priority = 'A')
    public void testCaseB(){
        System.out.println("test Case B");
    }
}
