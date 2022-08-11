package Pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard_sub_page1 {
public Giftcard_sub_page1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(id="giftcard_1_RecipientName")private WebElement recipient_name;
@FindBy(id="giftcard_1_RecipientEmail")private WebElement recipient_email;
@FindBy(id="giftcard_1_SenderName")private WebElement SenderName;
@FindBy(id="giftcard_1_SenderEmail")private WebElement sender_email;
@FindBy(id="add-to-cart-button-1")private WebElement subgift_card;
public WebElement getRecipient_name() {
	return recipient_name;
}
public WebElement getRecipient_email() {
	return recipient_email;
}
public WebElement getSenderName() {
	return SenderName;
}
public WebElement getSender_email() {
	return sender_email;
}
public WebElement getSubgift_card() {
	return subgift_card;
}

}
