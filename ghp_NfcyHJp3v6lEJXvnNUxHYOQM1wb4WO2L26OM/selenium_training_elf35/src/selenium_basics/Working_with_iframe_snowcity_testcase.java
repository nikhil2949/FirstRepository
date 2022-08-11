package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframe_snowcity_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://snowcityblr.com/contact-us/");
		 driver.manage().window().maximize();
		 String parentwindow=driver.getWindowHandle();
		 Thread.sleep(5000);
         driver.switchTo().frame(0);
			driver.findElement(By.xpath("//div[text()='Directions']")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			Set<String>child=driver.getWindowHandles();
			for(String childwindow:child) {
				driver.switchTo().window(parentwindow);
			}
			driver.quit();
	}
}


