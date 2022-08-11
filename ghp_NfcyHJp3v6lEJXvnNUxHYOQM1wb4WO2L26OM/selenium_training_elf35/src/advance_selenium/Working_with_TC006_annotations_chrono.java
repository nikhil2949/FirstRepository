package advance_selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_with_TC006_annotations_chrono {
@BeforeSuite
public void DemoBeforeSuit() {
	System.out.println("executing demobeforesuit");
}
@BeforeTest
public void DemoBeforeTest() {
	System.out.println("executing demobeforetest");
}
@BeforeClass
public void DemoBeforeClass() {
	System.out.println("executing demobeforeclass");
}
@BeforeMethod
public void DemoBeforeMethod() {
	System.out.println("executing demobeforemethod");
}
@Test
public void Demo() {
	System.out.println("executing @Test1 code");
}
@Test
public void Demo1() {
	System.out.println("executing @Test2 code");
}
@AfterMethod
public void aftermethod() {
	System.out.println("executing aftermethod code");
}
}
