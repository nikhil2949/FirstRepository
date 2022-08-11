package Utility_Methods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
public WebDriver driver;
@BeforeClass
public void Browser_Setup() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
String appurl=Working_with_utility_methods.ReadConfigurationData();
driver.get(appurl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@AfterClass
public void Browser_TearDown() throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
}
}
