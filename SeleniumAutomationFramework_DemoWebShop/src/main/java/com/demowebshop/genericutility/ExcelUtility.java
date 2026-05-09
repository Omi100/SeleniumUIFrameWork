package com.demowebshop.genericutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String FetchingStringDataFromExcelSheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		File file = new File("./src/test/resources/DWS_CommonData/RegistrationPage.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		 Workbook wb = WorkbookFactory.create(fis);
		 
		  String value  =  wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		  
		  wb.close();
		    
		  return value;
	}
	
	public Object[][] getExcelData(String sheetName,int rowNum) throws EncryptedDocumentException, IOException
	{
		File file = new File("./src/test/resources/DWS_CommonData/RegistrationPage.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(sheetName);
		
		int row = sh.getLastRowNum();
		int column = sh.getRow(rowNum).getLastCellNum();
		
		Object[][] data = new Object[row][column];
		
		for(int i =1 ;i<=row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				data[i-1][j]=sh.getRow(i).getCell(j).toString();
			}
			
		
		}
		
		wb.close();
		fis.close();
		return data;
	}	
		
		
	}

