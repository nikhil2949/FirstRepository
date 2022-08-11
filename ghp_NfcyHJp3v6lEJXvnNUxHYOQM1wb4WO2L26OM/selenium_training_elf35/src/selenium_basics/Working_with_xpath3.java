package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//a[@href='/register']")).click();
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nikhil");
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Niki");
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikhilagrahara@gmail.com");
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("nikhil");
		 
		 driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nikhil");
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
		 driver.close();

		 
		 
		 
	}

}
