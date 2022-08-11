package basicassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_assignment2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.makemytrip.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		    