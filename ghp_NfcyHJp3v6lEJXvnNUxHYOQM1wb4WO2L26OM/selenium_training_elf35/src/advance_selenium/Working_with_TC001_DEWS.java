package advance_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Working_with_TC001_DEWS {
@Test
public void Demo() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("java");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
driver.findElement(By.xpath("//input[@id='As']")).click();
WebElement dropdown1=driver.findElement(By.xpath("//select[@id='Cid']"));
Select select=new Select(dropdown1);
select.selectByIndex(1);
WebElement dropdown2=driver.findElement(By.xpath("//select[@id='Mid']"));
Select select1=new Select(dropdown2);
select1.selectByIndex(1);
driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
driver.close();
}
}