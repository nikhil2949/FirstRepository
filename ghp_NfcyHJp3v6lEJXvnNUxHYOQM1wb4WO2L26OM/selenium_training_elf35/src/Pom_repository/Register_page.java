package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
	public Register_page (WebDriver driver) {
    PageFactory.initElements(driver, this);
	}
@FindBy(id="gender-male") private WebElement gender_radiobutton;
@FindBy(id="FirstName") private WebElement first_name;
@FindBy(id="LastName") private WebElement last_name;
@FindBy(id="Email") private WebElement email_id;
@FindBy(id="Password") private WebElement password_id;
@FindBy(id="ConfirmPassword") private WebElement confirm_password;
@FindBy(id="register-button") private WebElement register_button;
public WebElement getGender_radiobutton() {
	return gender_radiobutton;
}
public WebElement getFirst_name() {
	return first_name;
}
public WebElement getLast_name() {
	return last_name;
}
public WebElement getEmail_id() {
	return email_id;
}
public WebElement getPassword_id() {
	return password_id;
}
public WebElement getConfirm_password() {
	return confirm_password;
}
public WebElement getRegister_button() {
	return register_button;
}





		
		
		
		
}
