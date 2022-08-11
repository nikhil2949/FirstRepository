package POM_TEST_CASE;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectObjmod.Cart_page;



public class TC_Add_giftcard_001 extends Utility_Methods.Base_Test {
	@Test
	public void addgiftcard() {
		//click on gift card
		ProjectObjmod.Home_page homepage = new ProjectObjmod.Home_page(driver);
		homepage.getGift_Cards().click();
		Reporter.log("clicked on gift card",true);
		assertEquals(homepage.getGift_Cards().isDisplayed(), "not clicked on gift card button");
		//click on Gift_Card_subpage
		ProjectObjmod.Gift_card_page giftcard = new ProjectObjmod.Gift_card_page(driver);
		giftcard.getGift_card1().click();
		Reporter.log("clicked on gift card subpage",true);
		assertEquals(homepage.getGift_Cards().isDisplayed(), "giftcard subpage is not displayed");
        //entering recipient name
		ProjectObjmod.Giftcard_sub_page1 subpage = new ProjectObjmod.Giftcard_sub_page1(driver);
		subpage.getRecipants_name().sendKeys("nikhil");
		Reporter.log("entered recipient name",true);
		assertEquals(subpage.getRecipants_name().isDisplayed(), "invalid recipient name");
        //entering recipient mail
		subpage.getRecipants_email().sendKeys("nikhilagrahara@gmail.com");
		Reporter.log("recipient mail is entered",true);
		assertEquals(subpage.getRecipants_email().isDisplayed(), "invalid recipient email");
        //entering user mail
		subpage.getYour_mail().sendKeys("nikhilagrahara@gmail.com");
		Reporter.log("user mail is entered",true);
		assertEquals(subpage.getYour_mail().isDisplayed(), "invalid user email");
        //entering username
		subpage.getYourname().sendKeys("nikhil");
		Reporter.log("user name is entered",true);
		assertEquals(subpage.getYourname().isDisplayed(), "invalid user name");
        //click on login link
		subpage.getSubgift_card().click();
		homepage.getShopping_cart().click();
		Cart_page cartpage = new Cart_page(driver);
		cartpage.getQuantityOfTheProduct("2");
		cartpage.getContinueshopping().click();
	}
}
