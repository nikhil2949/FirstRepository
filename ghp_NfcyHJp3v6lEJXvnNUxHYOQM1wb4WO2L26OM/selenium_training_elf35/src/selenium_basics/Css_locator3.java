package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("java");
		String searchbutton=driver.findElement(By.cssSelector("input[type='submit']")).getAttribute("value");
		System.out.println(searchbutton);
		
		if(searchbutton.equalsIgnoreCase("search")) {
			
			driver.findElement(By.cssSelector("input[type='submit']")).click();
		}
			String result=driver.findElement(By.cssSelector("strong[class='result']")).getText();
			System.out.println(result);
	        Thread.sleep(2000);
	}
}
	


