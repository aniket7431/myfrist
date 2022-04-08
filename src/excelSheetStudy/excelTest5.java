package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");	
		
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		CellType type1 = MySheet.getRow(0).getCell(0).getCellType();
		CellType type2 = MySheet.getRow(0).getCell(1).getCellType();
		CellType type3 = MySheet.getRow(0).getCell(2).getCellType();
		CellType type4 = MySheet.getRow(0).getCell(3).getCellType();
		
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		
		
	  String valve1 = MySheet.getRow(0).getCell(0).getStringCellValue();
       double valve2 = MySheet.getRow(0).getCell(1).getNumericCellValue();
       boolean valve3 = MySheet.getRow(0).getCell(2).getBooleanCellValue();
      String valve4 = MySheet.getRow(0).getCell(3).getStringCellValue();
      
      System.out.println(valve1);
      System.out.println(valve2);
      System.out.println(valve3);
      System.out.println(valve4);
      
	  
	  
		
		
		
	}

}
