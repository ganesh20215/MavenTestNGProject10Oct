package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {


    @Parameters({"courseName", "cityName"})
    @Test
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        //We never ever added test data into the test script
        searchTextBox.sendKeys(courseName + cityName);       //Test Data
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

    @Parameters({"courseName2", "cityName2"})
    @Test
    public void searchOnlineClasses2(String courseName2, String cityName2) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        //We never ever added test data into the test script
        searchTextBox.sendKeys(courseName2 + cityName2);       //Test Data
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
