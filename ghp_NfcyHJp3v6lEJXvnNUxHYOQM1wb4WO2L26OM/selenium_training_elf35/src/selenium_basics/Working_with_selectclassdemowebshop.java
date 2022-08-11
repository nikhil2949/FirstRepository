package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_selectclassdemowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.partialLinkText("Books")).click();
		 WebElement sortby=driver.findElement(By.id("products-orderby"));
		 Select option=new Select(sortby);
		 List<WebElement>values=option.getOptions();
		 for(int i=0;i<=values.size()-1;i++){
			 System.out.println(values.get(i).getText());
			 if(values.get(i).getText())
		 }
	}

}
