package ProjectObjmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
public Home_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Register']") private WebElement Register;

@FindBy(xpath="//a[text()='Log in']") private WebElement Login;

@FindBy(id="pollanswers-1") private WebElement pollanswers1;

@FindBy(id ="pollanswers-2") private WebElement pollanswers2;

@FindBy(id="pollanswers-3") private WebElement pollanswers3;

@FindBy(id="pollanswers-4") private WebElement pollanswers4;

@FindBy(id="vote-poll-1") private WebElement vote;

@FindBy(partialLinkText = "Gift") private WebElement Gift_Cards;

@FindBy(partialLinkText = "cart") private WebElement Shopping_cart;

public WebElement getShopping_cart() {
	return Shopping_cart;
}

public WebElement getGift_Cards() {
	return Gift_Cards;
}

public WebElement getPollanswers1() {
	return pollanswers1;
}

public WebElement getPollanswers2() {
	return pollanswers2;
}

public WebElement getPollanswers3() {
	return pollanswers3;
}

public WebElement getPollanswers4() {
	return pollanswers4;
}

public WebElement getVote() {
	return vote;
}

public WebElement getRegister() {
return Register;
}

public WebElement getLogin() {
return Login;
}
}

