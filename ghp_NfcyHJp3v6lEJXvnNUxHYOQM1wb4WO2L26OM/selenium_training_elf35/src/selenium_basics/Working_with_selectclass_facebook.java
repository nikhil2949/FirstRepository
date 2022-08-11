package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_selectclass_facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(2000);
	WebElement dayDropDown=driver.findElement(By.id("day"));
	Select dayDD=new Select(dayDropDown);
	dayDD.selectByIndex(30);
	WebElement monthDropDown=driver.findElement(By.id("Month")); 
	Select monthDD=new Select(monthDropDown);
	monthDD.selectByIndex(3);
	WebElement yearDropDown=driver.findElement(By.id("Year")); 
	Select yearDD=new Select(yearDropDown);
	yearDD.selectByIndex(3);
		 
		
	}

}
