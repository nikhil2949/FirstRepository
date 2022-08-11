package advance_selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_TC002_DEWS1 {
@Test
public void Demo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']")).click();
Set<String> cw=driver.getWindowHandles();
for(String cws:cw ) {
	driver.switchTo().window(cws);
	if(driver.getTitle().contains("face"))
	{
	
Thread.sleep(2000);
driver.close();
}
}
driver.close();
}

}