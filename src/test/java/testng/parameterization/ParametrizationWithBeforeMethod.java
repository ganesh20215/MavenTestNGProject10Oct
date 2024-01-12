package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametrizationWithBeforeMethod {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodExample(String browserName) {
        if (browserName.contentEquals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
        } else if (browserName.contentEquals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
        } else if (browserName.contentEquals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Ganesh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {
        WebElement searchTextBox = driver.findElement(By.name("q"));
        //We never ever added test data into the test script
        searchTextBox.sendKeys(courseName + cityName);       //Test Data
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

    @AfterMethod
    public void afterMethodExample() {

    }
}
