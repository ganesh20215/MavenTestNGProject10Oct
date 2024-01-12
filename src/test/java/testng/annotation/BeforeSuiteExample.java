package testng.annotation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSuiteExample {

    @BeforeSuite
    public void beforeSuiteEx(){
        System.out.println("Before Suite Example");
    }

    @AfterSuite
    public void afterSuiteEx(){
        System.out.println("After Suite Example");
    }
}
