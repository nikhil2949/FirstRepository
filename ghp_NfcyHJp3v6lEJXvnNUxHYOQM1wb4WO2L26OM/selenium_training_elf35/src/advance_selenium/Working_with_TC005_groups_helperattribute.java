package advance_selenium;

import org.testng.annotations.Test;

public class Working_with_TC005_groups_helperattribute {
@Test(groups="SmokeTesting")
public void DemoWebShop_Search() {
	System.out.println("executing demowebshop_Search");
}
@Test
public void  DemoWebShop_register() {
	System.out.println("executing demowebshop_register");
}
@Test(groups="SmokeTesting")
public void DemoWebShop_login() {
	System.out.println("executing demowebshop_login");
}
}
