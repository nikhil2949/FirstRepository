package Test_case2;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility_Methods.Base_Test;
import Utility_Methods.Working_with_utility_methods;


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


//public class Registration_form extends Base_Test {
	//@Test
	//public void Demo() throws IOException  {
		// WebDriver driver = new ChromeDriver();
		// String appurl=Working_with_utility_methods.ReadConfigurationData();
		// driver.get(appurl);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nikhil");
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Niki");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikhil123@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikhil");
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nikhil");
			driver.findElement(By.xpath("//input[@id='register-button']")).click();
            driver.close();


	}
}
