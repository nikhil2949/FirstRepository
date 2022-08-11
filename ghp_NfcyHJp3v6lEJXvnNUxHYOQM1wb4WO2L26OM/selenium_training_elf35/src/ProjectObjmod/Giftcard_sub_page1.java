package ProjectObjmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard_sub_page1 {
	public Giftcard_sub_page1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "giftcard_1_RecipientName")
	private WebElement recipants_name;

	@FindBy(id = "giftcard_1_RecipientEmail")
	private WebElement recipants_email;

	@FindBy(id = "giftcard_1_SenderName")
	private WebElement yourname;

	@FindBy(id = "giftcard_1_SenderEmail")
	private WebElement your_mail;

	@FindBy(id = "add-to-cart-button-1")
	private WebElement subgift_card;

	public WebElement getRecipants_name() {
		return recipants_name;
	}

	public WebElement getRecipants_email() {
		return recipants_email;
	}

	public WebElement getYourname() {
		return yourname;
	}

	public WebElement getYour_mail() {
		return your_mail;
	}

	public WebElement getSubgift_card() {
		return subgift_card;
	}

}
