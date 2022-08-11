package basicassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.name("FirstName")).sendKeys("Nikhil");
		 driver.findElement(By.name("LastName")).sendKeys("Niki");
		 
		 driver.close();
	}

}
