package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/admin/Downloads/xpath1.html");
		 driver.findElement(By.xpath("/html/body/div/input[1]")).sendKeys("Nikhil");
		 driver.findElement(By.xpath("/html/body/div/input[2]")).sendKeys("niki"); 
		 driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TESTYANTRA");
		 driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("BANGLORE");
		 
	driver.close();
	}
}
