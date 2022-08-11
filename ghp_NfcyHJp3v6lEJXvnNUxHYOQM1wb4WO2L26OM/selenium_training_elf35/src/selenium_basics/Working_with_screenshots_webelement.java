package selenium_basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_screenshots_webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		
       WebElement searchTF=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
    File temp=searchTF.getScreenshotAs(OutputType.FILE);
    File dest=new File("./Screenshots/element.png");
    try {
    	FileHandler.copy(temp,dest);
    }catch(IOException e) {
    	e.printStackTrace();
    }
	}

}
