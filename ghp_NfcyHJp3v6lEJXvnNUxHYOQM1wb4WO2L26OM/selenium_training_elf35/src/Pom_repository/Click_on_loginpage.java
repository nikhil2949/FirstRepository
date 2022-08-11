package Pom_repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility_Methods.Base_Test;

public class Click_on_loginpage extends Base_Test {
@Test
public void Click_on_loginpage() {
	Home_page homepage=new Home_page(driver);
	homepage.getLogin().click();
		Login_page login=new Login_page(driver);
		login.getEmail().sendKeys("nikhilagrahara@gmail.com");
		login.getPassword().sendKeys("nikhil2949");
		login.getLogin_button().click();
}

}



