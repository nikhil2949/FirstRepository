package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public Login_page (WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email") private WebElement email;
	@FindBy(id="Password") private WebElement password;
	@FindBy(xpath="//input[@class='button-1 login-button']") private WebElement login_button;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin_button() {
		return login_button;
	}
	


}
