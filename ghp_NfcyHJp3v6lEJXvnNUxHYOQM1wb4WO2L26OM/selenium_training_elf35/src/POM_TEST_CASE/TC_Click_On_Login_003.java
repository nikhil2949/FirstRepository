package POM_TEST_CASE;

import org.testng.annotations.Test;

import ProjectObjmod.Home_page;
import ProjectObjmod.Login_page;
import Utility_Methods.Base_Test;


public class TC_Click_on_login_003 extends Base_Test{
	@Test
public void click_on_login() {
    Home_page home_page=new Home_page(driver);
    home_page.getLogin().click();
	Login_page lgin_page=new Login_page(driver);
	lgin_page.getLogin().sendKeys("nikhil");
	lgin_page.getPassword().sendKeys("nikhil2949");
	lgin_page.getEmail().sendKeys("nikhilagrahara@gmail.com");
	lgin_page.getLogin().click();

}
}