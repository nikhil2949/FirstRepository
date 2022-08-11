
package ProjectObjmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
public Register_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


@FindBy(id="gender-male") private WebElement genderradio_button;

@FindBy(id="FirstName") private WebElement FirstName;

@FindBy(id="LastName") private WebElement LastName;

@FindBy(id="Email") private WebElement email;

@FindBy(id="Password") private WebElement Password;

@FindBy(id="ConfirmPassword") private WebElement ConfirmPassword;

@FindBy(id="register-button") private WebElement register_button;



public WebElement getGenderradio_button() {
	return genderradio_button;
}

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getConfirmPassword() {
	return ConfirmPassword;
}

public WebElement getRegister_button() {
	return register_button;
}


}

