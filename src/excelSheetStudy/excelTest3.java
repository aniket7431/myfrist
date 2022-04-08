package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		

		FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");	
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		for(int i=0; i<=1; i++)    //out row 0-1
		{
			for(int j=0;j<=3;j++ )   //inner cell 0 -3
			{
				 String valve = Mysheet.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.println( valve + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
