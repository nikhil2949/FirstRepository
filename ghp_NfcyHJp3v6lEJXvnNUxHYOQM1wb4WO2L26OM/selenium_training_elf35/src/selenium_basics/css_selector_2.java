package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		// WebElement register_link=driver.findElement(By.cssSelector("a[class='ico-register']"));
	//	 String value=register_link.getText();
		//System.out.println(value);
		 WebElement register_link=driver.findElement(By.cssSelector("a[a[class='ico-login']]"));
		 String value=register_link.getText();
				System.out.println(value);
		driver.close();
				
				
	}

}
