
package ProjectObjmod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	public WebDriver driver;
	

	public Cart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getQuantityOfTheProduct(String productName) {
		return driver.findElement(By.xpath(
				"//a[@class='product-name' and text()='"+productName+"']/../..//input[contains(@name,'removefromcart')]"));

	}

	public WebElement getChechBoxOfTheProduct(String productName) {
		return driver.findElement(By.xpath(
				"	//a[@class=\"product-name\" and text()='"+productName+"']/../..//input[@name='removefromcart']"));
	}

	public WebElement getQuantityOfTheProduct1(String productName) {
		return driver.findElement(By.xpath(
				"//a[@class='product-name' and text()='"+productName+"'] /../..//input[contains(@name,'itemquantity')]"));

	}

	public WebElement getContinueshopping() {
		return driver.findElement(By.xpath("//input[@name='continueshopping']"));
	}

	public WebElement getUpdateCart() {
		return driver.findElement(By.xpath("//input[@name='updatecart']"));
	}

	public WebElement getChechBoxOfTheProduct1() {
		return driver.findElement(By.xpath(
				"//a[@class='product-name' and text()='$5 Virtual Gift Card']/../..//input[contains(@name,'removefromcart')]"));
	}
}
