package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
     WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     Actions action=new Actions(driver);
     action.doubleClick(button).build().perform();
    Thread.sleep(2000);
    Alert aler=driver.switchTo().alert();
   //to get the text in console
   String alert_text=aler.getText();
   System.out.println(alert_text);
   aler.accept();


	}

}
