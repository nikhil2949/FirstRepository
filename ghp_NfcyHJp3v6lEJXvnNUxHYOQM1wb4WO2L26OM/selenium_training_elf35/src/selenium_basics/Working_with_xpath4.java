package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		 driver.findElement(By.xpath("//input[@value='Vote']")).click();
		 Thread.sleep(2000);
		 
	}

}
