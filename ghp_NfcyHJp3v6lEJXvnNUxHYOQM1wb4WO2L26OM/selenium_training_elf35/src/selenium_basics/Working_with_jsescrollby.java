package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_jsescrollby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://demowebshop.tricentis.com/");
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
Thread.sleep(2000);
jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");

	}

}
