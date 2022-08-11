package advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_launch_app_based_on_booleanvalue {

	public static void main(String[] args) throws IOException {
		//launching the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//reading the test data from excel
		FileInputStream fis = new FileInputStream("./Testdata/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet1 = workbook.getSheet("Sheet1");
		boolean flag=sheet1.getRow(0).getCell().getStringCellValue();
		if(flag) {
			String url=sheet1.getRow(0).getCell(0).getStringCellValue();
			String firstName=sheet1.getRow().getCell().getStringCellValue();
			int mobileno=(int)sheet1.getRow(0).getCell(0).getStringCellValue();
			driver.get(url);
			driver.findElement(By.name("first_name")).sendKeys(firstName);
			driver.findElement(By.id("phone")).sendKeys(mobileno+" ");
		
		}
		else {
	    String url=sheet1.getRow(0).getCell(0).getStringCellValue();
	    String firstName=sheet1.getRow(0).getCell(0).getStringCellValue();
        int mobileno=(int)sheet1.getRow(0).getCell(0).getStringCellValue();
        driver.get(url);
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.id("mobile")).sendKeys(mobileno+" ");
        driver.findElement(By.name("name")).sendKeys(firstName);
		}
	}
}
