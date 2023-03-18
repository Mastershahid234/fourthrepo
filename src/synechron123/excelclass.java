package synechron123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelclass {
	// String value="";
	public static String data() throws EncryptedDocumentException, IOException {
		//String value = "";
		FileInputStream file = new FileInputStream("./excel/syne.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.toString();
		return value;
	}

}
