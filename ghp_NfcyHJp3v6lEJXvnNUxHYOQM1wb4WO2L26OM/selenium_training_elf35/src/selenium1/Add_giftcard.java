package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pom_repository.Home_page;
import Utility_Methods.BaseTest1;

public class Add_giftcard extends BaseTest1 {
	@Test
	public void addgiftcard() {
		Home_page homepage = new Home_page(driver);
		homepage.getGift_Cards().click();
		Gift_card_page giftcard = new Gift_card_page(driver);
		giftcard.getGift_card1().click();
		Giftcard_sub_page1 subpage = new Giftcard_sub_page1(driver);
		subpage.getRecipants_name().sendKeys("nikhil");
		subpage.getRecipants_email().sendKeys("nikhilagrahara@gmail.com");
		subpage.getYour_mail().sendKeys("nikhilagrahara@gmail.com");
		subpage.getYourname().sendKeys("nikhil");
		subpage.getSubgift_card().click();
		homepage.getShopping_cart().click();
		Cart_page cartpage = new Cart_page(driver);
		cartpage.getQuantityOfTheProduct("2");
		cartpage.getContinueshopping().click();
	}
}
