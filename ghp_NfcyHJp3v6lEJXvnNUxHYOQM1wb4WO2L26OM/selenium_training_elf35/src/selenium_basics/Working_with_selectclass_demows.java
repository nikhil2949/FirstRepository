package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_selectclass_demows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.partialLinkText("Books")).click();
		 Select dropDown =new Select(driver.findElement(By.id("products-pagesize")));
		 List<WebElement> options=dropDown.getOptions();
		 for(WebElement text:options) {
			 System.out.println(text.getText());
			 
		 }
	}

}
