package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		 //identify the webelement
		 WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
		 WebElement jobs_by_skill=driver.findElement(By.xpath("//a[text()='Jobs by designation']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(jobs).build().perform();
		 action.moveToElement(jobs_by_skill).click().build().perform();
	}

}
