package advance_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_dataprovider {
@DataProvider(name="TestData")
public Object[][] testdata(){
	Object[][]data=new Object[2][2];
	data[0][0]="Nikhil";
	data[0][1]="mercury";
	data[1][0]="nikhilagrahara@gmail.com";
	data[1][1]="nikhil2949";
	return data;
} 
@Test(dataProvider="TestData")
public void DataProviderDemo(String Username,String Password) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Username);
driver.findElement(By.xpath("//input[@class='password']")).sendKeys(Password);
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
}