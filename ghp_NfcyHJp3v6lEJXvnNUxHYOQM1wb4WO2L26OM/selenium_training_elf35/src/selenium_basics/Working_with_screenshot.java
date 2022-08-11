package selenium_basics;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File temp=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./Screenshots/page1.png");
        try {
        	FileUtils.copyFile(temp,dest);
        }catch(IOException e) {
        	e.printStackTrace();
        }
        		)

}
