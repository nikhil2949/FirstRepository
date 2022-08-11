package ProjectObjmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gift_card_page {

	public Gift_card_page(WebDriver driver) {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement gift_card1;

	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement gift_card2;

	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	private WebElement gift_card3;

	@FindBy(xpath = "(//input[@value='Add to cart'])[4]")
	private WebElement gift_card4;

	public WebElement getGift_card1() {
		return gift_card1;
	}

	public WebElement getGift_card2() {
		return gift_card2;
	}

	public WebElement getGift_card3() {
		return gift_card3;
	}

	public WebElement getGift_card4() {
		return gift_card4;
	}
}
