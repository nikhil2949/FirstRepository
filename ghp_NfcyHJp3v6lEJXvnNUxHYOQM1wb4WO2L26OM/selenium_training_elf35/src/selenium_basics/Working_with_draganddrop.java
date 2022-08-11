package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//WebElement drag1=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
//WebElement drop1=driver.findElement(By.xpath("//div[text()='Spain']"));
//WebElement drag2=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
//WebElement drop2=driver.findElement(By.xpath("//div[text()='Norway']"));
WebElement drag=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
WebElement drop=driver.findElement(By.xpath("//div[text()='United States']"));



Actions action=new Actions(driver);
action.dragAndDrop(drag, drop).build().perform();

	}

}
