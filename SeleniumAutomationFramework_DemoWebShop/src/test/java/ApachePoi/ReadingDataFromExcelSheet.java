package ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadingDataFromExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File("C:\\Users\\omkar_nuhuaww\\OneDrive\\Desktop\\ReadingDataFromExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		//this is An Factory Methods and We are inside the Excel File now
		Workbook wb = WorkbookFactory.create(fis);
		
		//get into The Sheet by using Workbook wb reference 
		Sheet sh = wb.getSheet("Sheet1");
		
		//indexing starts from 0 so be caution
		Row r = sh.getRow(1);
		
		//go into specific cell in a row
		Cell c = r.getCell(1);
		
		//get the data by calling the cell methods 1)getStringCellValue 2)getNumericCellValue
		
		 String Name = c.getStringCellValue();
		 
		 long ContactNo = (long) r.getCell(2).getNumericCellValue();
		
		 
		 
		 //Printing the data
		 System.out.println("The Name is : "+Name);
		 
		 System.out.println("ContactNo: "+ContactNo);

		 //Virtually closing The Workbook
		 wb.close();
		
		
		
	}

}
