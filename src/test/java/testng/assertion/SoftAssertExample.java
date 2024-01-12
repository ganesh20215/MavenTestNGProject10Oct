package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void softAssertDemo1(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        softAssert.assertEquals(title, "Rediffmail", "Rediffmail title should be matched");
        softAssert.assertTrue(driver.findElement(By.id("login1")).isEnabled(), "login textbox should be enabled");
        WebElement rememberElement = driver.findElement(By.id("remember"));
        rememberElement.click();
        softAssert.assertFalse(rememberElement.isSelected(), "Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void softAssertDemo2(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        softAssert.assertEquals(title, "Rediffmail", "Rediffmail title should be matched");
        softAssert.assertTrue(driver.findElement(By.id("login1")).isEnabled(), "login textbox should be enabled");
        WebElement rememberElement = driver.findElement(By.id("remember"));
        rememberElement.click();
        softAssert.assertFalse(rememberElement.isSelected(), "Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void softAssertDemo3(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        softAssert.assertEquals(title, "Rediffmail", "Rediffmail title should be matched");
        softAssert.assertTrue(driver.findElement(By.id("login1")).isEnabled(), "login textbox should be enabled");
        WebElement rememberElement = driver.findElement(By.id("remember"));
        rememberElement.click();
        softAssert.assertTrue(rememberElement.isSelected(), "Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }

    @Test
    public void softAssertDemo4(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        softAssert.assertEquals(title, "rediffmail", "Rediffmail title should be matched");
        softAssert.assertTrue(driver.findElement(By.id("login1")).isEnabled(), "login textbox should be enabled");
        WebElement rememberElement = driver.findElement(By.id("remember"));
        rememberElement.click();
        softAssert.assertTrue(rememberElement.isSelected(), "Remember checkbox isn't clickable");
        softAssert.assertAll();
        driver.close();
    }
}
