package POM_TEST_CASE;

import static org.testng.Assert.assertTrue;

import org.apache.poi.hssf.record.RefreshAllRecord;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectObjmod.Home_page;
import ProjectObjmod.Register_page;


public class Registration_for_demoweb_shop extends Utility_Methods.Base_Test {
	@Test
	//Registration for DemoWebshop
	public void registration_for_demoweb_shop() {
		
		Home_page home_page = new Home_page(driver);
		home_page.getRegister().click();
		Reporter.log("clicked on register link");
		assertTrue(home_page.getRegister().isDisplayed(), "Registration page is not displayed");
	
		Register_page register_page = new Register_page(driver);
		register_page.getGenderradio_button().click();
        Reporter.log("clicked on radio button");
        assertTrue(register_page.getGenderradio_button().isSelected());
        
        
        //enter first name
		register_page.getFirstName().sendKeys("Nikhil");
		Reporter.log("first name is entered",true);
		assertTrue(register_page.getFirstName().isDisplayed(), "first name is not entered");
		
		//enter second name
		register_page.getLastName().sendKeys("Niki");
		Reporter.log("second name is entered",true);
		assertTrue(register_page.getLastName().isDisplayed(), "last name is not entered");
		
		//enter gmail
		register_page.getEmail().sendKeys("nikhilagrahara@gmail.com");
		Reporter.log("email is entered",true);
		assertTrue(register_page.getEmail().isDisplayed(), "email is not entered");
		
		//enter password
		register_page.getPassword().sendKeys("nikhil2949");
		Reporter.log("password is entered",true);
		assertTrue(register_page.getPassword().isDisplayed(), "password is not entered");
		
		//enter confirm password
		register_page.getConfirmPassword().sendKeys("nikhil2949");
	    Reporter.log("enter confirm password",true);
	    assertTrue(register_page.getConfirmPassword().isDisplayed(), "entered password is not correct");
		
	    //register 
		register_page.getRegister_button().click();
	    Reporter.log("register is successful",true);
	    assertTrue(register_page.getRegister_button().isDisplayed(),"register button is not correct");
	}
}
