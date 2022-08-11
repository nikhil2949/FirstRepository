package Test_case_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_001_demowebshop {
@Test
public void Practice(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
	driver.findElement(By.id("LastName")).sendKeys("Niki");
	driver.findElement(By.id("Email")).sendKeys("nikhilagrahara@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("nikhil2949");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("nikhil2949");
driver.findElement(By.id("register-button")).click();
}
}
