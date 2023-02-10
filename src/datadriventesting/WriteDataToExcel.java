package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testresources/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		//Row r = sh.createRow(4);
		
		Row r = sh.getRow(4);
		Cell c = r.createCell(0);
		
		c.setCellValue("Test");
		
		FileOutputStream fos = new FileOutputStream("./testresources/Data.xlsx");
		wb.write(fos);
		wb.close();

	}

}
