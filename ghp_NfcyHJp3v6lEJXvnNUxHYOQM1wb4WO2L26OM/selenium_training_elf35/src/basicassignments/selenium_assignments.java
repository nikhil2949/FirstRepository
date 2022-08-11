package basicassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium_training_elf35\\drivers\\chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.co.in");
	    
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	     
	   String pagesource= driver.getPageSource();
	   System.out.println(pagesource);
	   driver.close();// closes only the parent windows
	   driver.quit();//closes both parent and child windows
	}

}
