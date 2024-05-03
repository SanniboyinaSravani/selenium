package VTIGER;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Srava\\OneDrive\\Documents\\Testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	String data1 = wb.getSheet("Sheett1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data1);
		
		
	}

}
