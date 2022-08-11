package ProjectObjmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
public Login_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="Email") private WebElement Email;

@FindBy(id="Password") private WebElement Password;

@FindBy(xpath="(//input[@type='submit'])[2]") 
private WebElement login;

public WebElement getEmail() {
	return Email;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getLogin() {
	return login;
}

}
