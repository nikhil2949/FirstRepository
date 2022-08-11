package Utility_Methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Working_with_utility_methods {

	static String Filepath;
	static FileInputStream fis;
	static Properties prop;

	public static String ReadConfigurationData() throws IOException {
		Filepath="./Test_Configurations/Test_Configuration.properties";
		fis=new FileInputStream(Filepath);
		prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("Url");
		return url;
}
	public static void Enter_Text(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Click_Element(WebElement element) {
		element.click();
	}
}
