package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_findelements_radiobutton_sortby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.partialLinkText("Books")).click();
		 WebElement dropDown=driver.findElement(By.id("products-orderby"));
		 Select option=new Select(dropDown);
		 List<WebElement> options=option.getOptions();
		 for(int i=1;i<options.size();i++) {
			 WebElement dropDown1=driver.findElement(By.id("products-orderby"));
			 Select option1=new Select(dropDown1);
			option1.selectByIndex(3);
		 }
	}

}
