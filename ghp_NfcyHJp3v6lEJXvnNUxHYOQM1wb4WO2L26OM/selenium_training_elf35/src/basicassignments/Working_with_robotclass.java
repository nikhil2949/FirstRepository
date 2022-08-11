package basicassignments;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/admin/Downloads/demo%20(1).html");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebElement file_btn=driver.findElement(By.id("resume"));
Actions action=new Actions(driver);
action.moveToElement(file_btn).click().perform();
Thread.sleep(2000);
//object for robot class
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_D);
robot.keyPress(KeyEvent.VK_A);
robot.keyPress(KeyEvent.VK_T);
robot.keyPress(KeyEvent.VK_A);
robot.keyRelease(KeyEvent.VK_TAB);
for(int i=0;i<=2;i++) {
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_TAB);
}
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
robot.mouseMove(730,700);
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
driver.close();

	}

}

