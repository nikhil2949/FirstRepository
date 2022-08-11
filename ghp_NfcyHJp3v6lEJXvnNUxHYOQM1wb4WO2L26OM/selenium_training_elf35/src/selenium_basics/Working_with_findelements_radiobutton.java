package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findelements_radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demowebshop.tricentis.com/");
		 List <WebElement> radioButton =driver.findElements(By.xpath("//input[@type='radio']"));
		// for(WebElement Elements:radioButton) {
			// Elements.click();
			for(int i=0;i<radioButton.size();i++){
			radioButton.get(i).click();
		 }
	}


}
	
