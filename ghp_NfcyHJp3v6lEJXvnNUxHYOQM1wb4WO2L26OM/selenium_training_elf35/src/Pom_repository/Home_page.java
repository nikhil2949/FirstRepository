package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
public Home_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Register']")
private WebElement Register;

@FindBy(xpath="//a[text()='Log in']")
private WebElement Login;

@FindBy(id="pollanswers-1") private WebElement pollanswer1;
@FindBy(id="pollanswers-2") private WebElement pollanswer2;
@FindBy(id="pollanswers-3") private WebElement pollanswer3;
@FindBy(id="pollanswers-4") private WebElement pollanswer4;
public WebElement getPollanswer1() {
	return pollanswer1;
}

public WebElement getPollanswer2() {
	return pollanswer2;
}

public WebElement getPollanswer3() {
	return pollanswer3;
}

public WebElement getPollanswer4() {
	return pollanswer4;
}

public WebElement getRegister() {
	return Register;
}

public WebElement getLogin() {
	return Login;
}



}

