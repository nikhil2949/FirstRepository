package Test_case2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility_Methods.Base_Test;
import Utility_Methods.Working_with_utility_methods;

public class Search_textfield extends Base_Test {
	@Test
	public void Demo() throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		 //String appurl=Working_with_utility_methods.ReadConfigurationData();
		 //driver.get(appurl);

	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement search=driver.findElement(By.id("small-searchterms"));
	Working_with_utility_methods.Enter_Text(search,"mobiles");
	WebElement search_btn=driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
	Working_with_utility_methods.Click_Element(search_btn);
	//driver.findElement(By.xpath("//input[@id='gender-male']")).click();

	}
}
