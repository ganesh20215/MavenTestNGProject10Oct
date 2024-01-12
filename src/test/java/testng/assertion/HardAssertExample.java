package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {


    @Test
    public void hardAssertDemo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Rediffmail", "Rediffmail title should be matched");
        Assert.assertTrue(driver.findElement(By.id("login1")).isEnabled(), "login textbox should be enabled");
        driver.close();
    }
}
