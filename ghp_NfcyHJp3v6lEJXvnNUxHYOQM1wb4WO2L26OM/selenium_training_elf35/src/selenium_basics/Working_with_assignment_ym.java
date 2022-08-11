package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_assignment_ym {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		 Thread.sleep(3000);
		String cost1= driver.findElement(By.xpath("(//span[@class='product-unit-price'])[1]")).getText();
		System.out.println(cost1);
		Thread.sleep(6000);
		String cost2= driver.findElement(By.xpath("(//span[@class='product-unit-price'])[2]")).getText();
        System.out.println(cost2);
        Thread.sleep(6000);
       double d= Double.parseDouble(cost1);
       double d1= Double.parseDouble(cost2);
       if(d>d1) {
    		  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
    		  driver.findElement(By.xpath("//input[@name='updatecart']")).click();
    	   }
       driver.close();
       }



	}


