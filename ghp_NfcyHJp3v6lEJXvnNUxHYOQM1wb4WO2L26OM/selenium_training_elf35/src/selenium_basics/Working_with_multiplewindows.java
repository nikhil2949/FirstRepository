package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/admin/Downloads/demo%20(1).html");
		 driver.manage().window().maximize();
//to store parent window id before switching to child window
		 String parentwindow=driver.getWindowHandle();
		// System.out.println(parentwindow);
		 //statement which opens child window
		driver.findElement(By.xpath("//a[text()='Webshop']")).click();
		Set<String>child_windows=driver.getWindowHandles();
		for(String childwindow:child_windows) {
			//System.out.println(childwindow);
			driver.switchTo().window(childwindow);
			if(driver.getTitle().contains("Web")) {
				driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.close();
		
			}
		
	}

