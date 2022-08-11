package advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_Properties_files_TC007 {
@Test
public void ReadData() throws IOException {
	String Filepath="./Test_Configurations/Test_Configuration.properties";
	FileInputStream fis=new FileInputStream(Filepath);
	//creating object for properties class
	Properties prop=new Properties();
	prop.load(fis);
	String name=prop.getProperty("Name");
    System.out.println(name);
    String location=prop.getProperty("Location");
    System.out.println(location);
    String Company=prop.getProperty("Company");
    System.out.println(Company);

}
}
