package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelTest2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//reading singl row --> static

		FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");
		
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		for (int i=0 ;i<=3 ;i++)
		{
			String valve = MySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(valve);
		}
		

	}

}
