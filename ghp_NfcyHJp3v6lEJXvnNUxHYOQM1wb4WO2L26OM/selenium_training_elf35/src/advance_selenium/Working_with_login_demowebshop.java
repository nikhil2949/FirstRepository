package advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility_Methods.Working_with_utility_methods;
public class Working_with_login_demowebshop{
	WebDriver driver;
	String Filepath;
	FileInputStream fis;
	Properties prop;
@AfterTest
public void BrowserTearDown() throws InterruptedException {
Thread.sleep(2000);
driver.close();
}
@BeforeTest
public void BrowserSetup() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	String appurl=Working_with_utility_methods.ReadConfigurationData();
	driver.get(appurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test
public void Demo() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikhilagrahara@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil2949");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
public String ReadConfigurationData() throws IOException {
Filepath="./Test_Configuration/Test_Configuration.properties";
fis=new FileInputStream(Filepath);
prop=new Properties();
prop.load(fis);
String url=prop.getProperty("http://demowebshop.tricentis.com/");
return url;
}
}
