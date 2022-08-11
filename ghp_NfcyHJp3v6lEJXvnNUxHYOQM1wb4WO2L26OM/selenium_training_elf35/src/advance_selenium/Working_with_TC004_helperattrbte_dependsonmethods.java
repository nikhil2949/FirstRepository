package advance_selenium;

import org.testng.annotations.Test;

public class Working_with_TC004_helperattrbte_dependsonmethods {
@Test(dependsOnMethods="DemoWebShop_login")
public void DemoWebShop_Search() {
	System.out.println("executing demowebshop_search");
}
@Test
public void DemoWebShop_register() {
	System.out.println("executing demowebshop_register");

}
@Test(dependsOnMethods="DemoWebShop_register")
public void DemoWebShop_login() {
	System.out.println("executing demowebshop_login");

}

}
 