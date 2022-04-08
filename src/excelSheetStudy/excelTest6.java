package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		
			FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		int totalRowCount = Mysheet.getLastRowNum();
		  int totalColumnCount = Mysheet.getRow(0).getLastCellNum()-1;
		 
		  for (int i=0 ; i<=totalRowCount ;i++)   //outer for row
		  {
			  for (int j=0; j<=totalColumnCount;j++)
				                                              // ineer for column
		  {      Cell info = Mysheet.getRow(i).getCell(j);
               CellType type = info.getCellType();                 // string ,numrtic , boolan
               
               if (type == CellType.STRING )
             
               {   String valve = info.getStringCellValue();
               System.out.print(valve +" ");
                }
               
               else if (type == CellType.NUMERIC)
               {
            	   double valve = info.getNumericCellValue();
            	   System.out.print(valve + " ");
            	   }
               
             //  else if (type == CellType.BOOLEAN) ;
               else if (type == CellType.BOOLEAN)
               {
            	   boolean valve = info.getBooleanCellValue();
            	   System.out.print(valve +" ");
               }
            	   }System.out.println();
		  
               }
	}


}
