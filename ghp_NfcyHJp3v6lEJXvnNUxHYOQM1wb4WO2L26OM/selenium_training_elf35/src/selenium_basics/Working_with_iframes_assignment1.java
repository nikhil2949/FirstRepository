package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframes_assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/admin/Downloads/iframe.html");
		 driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.switchTo().frame("BUSINESS");
	      driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
	     // driver.findElement(By.xpath("//a[text()='FOOD']")).click();
	      driver.switchTo().defaultContent();
	      driver.findElement(By.xpath("//a[text()='Google']")).click();

	      
	      

	      

	}

}
