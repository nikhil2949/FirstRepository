package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/admin/Downloads/xpath.html");
		 driver.findElement(By.xpath("//input[@type='Username']")).sendKeys("Nikhil");
		 driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Niki");
		 driver.findElement(By.xpath("//button[text()='SignOn']")).click();
driver.close();
	}

}
