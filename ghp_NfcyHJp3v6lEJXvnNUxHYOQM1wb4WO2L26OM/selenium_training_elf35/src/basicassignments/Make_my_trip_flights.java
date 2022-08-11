
package basicassignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Make_my_trip_flights {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
//		FileInputStream fis = new FileInputStream("./Testdata/testdata.xlsx");
//		Workbook workbook = WorkbookFactory.create(fis);
//
//		String data2 = workbook.getSheet("Organisation").getRow(2).getCell(0).getStringCellValue();
		//System.out.println(data2);
		//driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();		
		driver.findElement(By.id("fromCity")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Bengaluru");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='SUGGESTIONS ']/../..")));
		from.sendKeys("Bengaluru",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.id("To")).click();
		WebElement to = driver.findElement(By.xpath("(//input[@placeholder='To'"));
		to.sendKeys("Mumbai");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='SUGGESTIONS ']/../..")));
		from.sendKeys("Mumbai",Keys.ARROW_DOWN, Keys.ENTER);

	}

}
           
