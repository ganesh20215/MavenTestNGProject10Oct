package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\Ganesh\\Downloads\\NewFile.xlsx", "testCase1");
        return arrObj;
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);        //File Access
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);          //Excel Type
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);                     //Sheet access
        XSSFRow row = sheet.getRow(0);                                  //0 index accessing
        int noOfRows = sheet.getPhysicalNumberOfRows();                         //No of rows
        int noOfCols = row.getLastCellNum();                                    //No of cols

        Cell cell;
        String[][] data = new String[noOfRows - 1][noOfCols];

        for (int i = 1; i < noOfRows-1; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }


    @Test(dataProvider = "test-data")
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchTextBox = driver.findElement(By.name("q"));
        //We never ever added test data into the test script
        searchTextBox.sendKeys(courseName + cityName);       //Test Data
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}

