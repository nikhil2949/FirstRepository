package advance_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_subscribe_demowebshop {
@Test
public void Demo() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("nikhilagrahara@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
}
}
