package Pom_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	public WebDriver driver;
public Cart_page(WebDriver driver) {
	driver=this.driver;
PageFactory.initElements(driver,this);
}
public WebElement getQuantityofTheProduct(String productName) {
	return driver.findElement(By.xpath("//a[@class='product-name and text()='"+productName+"']/../..//input[contains@name,'removefromcart')]"));
}
public WebElement getCheckBoxofTheProduct(String productName) {
	return driver.findElement(By.xpath("//a[@class=\"product-name\" and text()='"+productName+"']/../..//input[@name='removefromcart']"));
}
public WebElement getQuantityofTheProduct1(String productName) {
return driver.findElement(By.xpath("//a[@class='product-name and text()='"+productName+"']/../..//input[contains(@name,'itemquantity')]"));
}
public WebElement getContinueShopping() {
	return driver.findElement(By.xpath("//input[@name='continueshopping']"));
	
}
public WebElement getUpdateCart() {
	return driver.findElement(By.xpath("//input[@name='updatecart']"));
}
public WebElement getCheckBoxofThProduct1() {
	return driver.findElement(By.xpath("//a[@class='product-name' and text()='$5 Virtual Gift Card]/../..//input[contains(@name,'removefromcart')]"));
}
}
