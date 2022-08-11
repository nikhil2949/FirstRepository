package advance_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_registration_form {

	@Test
	public void Demo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nikhil");
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Niki");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikhil123@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil");
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nikhil");
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
            driver.close();


	}

}
