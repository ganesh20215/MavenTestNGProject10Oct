package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationExample {

    public static WebDriver driver;

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun(){
        return new Object[][]{
                {"Selenium", "Pune"},
                {"Java", "Mumbai"},
                {"Python", "Nashik"}
        };
    }


    @Test(dataProvider = "test-data")
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchTextBox = driver.findElement(By.name("q"));
        //We never ever added test data into the test script
        searchTextBox.sendKeys(courseName + cityName);       //Test Data
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
