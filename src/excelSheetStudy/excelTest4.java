package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");	
		
	Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
	
	//method for geting row from excel
	 int laslRowNum = MySheet.getLastRowNum();
		System.out.print("last row num" + laslRowNum);  
		
		int TotalNumberofRow = laslRowNum ;
		//method for getting cell sheet last cell num
		short lastCellNum = MySheet.getRow(0).getLastCellNum();
		 System.out.print("last cell num is " + lastCellNum );
		  
		 int TotalNumofCollumns = lastCellNum-1 ; //5
		 
		  for (int i=0 ; i<=TotalNumberofRow ;i++)  // out row
		  {
			for (int j=0; j<=TotalNumofCollumns;j++)  
			{
				
				String valve = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(valve + " ");
			}
			System.out.println();  
		  }
			  
			  
			  
			  
		
		
		
		
		
		
	}

}
