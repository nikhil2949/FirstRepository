package advance_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_workbook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
double data = workbook.getSheet("Organisation").getRow(7).getCell(5).getNumericCellValue();
System.out.println(data);

String data1=workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
System.out.println(data1);

boolean data2=workbook.getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
System.out.println(data2);

java.util.Date data3=workbook.getSheet("Sheet1").getRow(5).getCell(2).getDateCellValue();
System.out.println(data3);

	}
}