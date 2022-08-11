package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_actionclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 WebElement categories=driver.findElement(By.xpath("//a[text()='Computers']"));
		 WebElement categories_by_desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(categories).build().perform();
		 action.moveToElement(categories_by_desktop).click().build().perform();
		 
		
	}

}
