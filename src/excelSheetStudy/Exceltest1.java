package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceltest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");
		
		//   String valve = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
       //System.out.println("data from excel is" + valve);

   // double valve1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
 
 //System.out.println("data is " + valve1);
		
		
		
		
		     Workbook test = WorkbookFactory.create(Myfile);
		   Sheet Mysheet = test.getSheet("Sheet1");
		     Row MyRow = Mysheet.getRow(0);
	       Cell Mycell = MyRow.getCell(0);
		              String Myvalve = Mycell.getStringCellValue();
		              
		              System.out.println(Mysheet.getRow(0).getCell(0).getStringCellValue());
		              
		              System.out.println(Mysheet.getRow(0).getCell(1).getStringCellValue());
		              
		              
		              
		              
		              
		              
		              
		              
		  
		  
		  
		  
	}

}
