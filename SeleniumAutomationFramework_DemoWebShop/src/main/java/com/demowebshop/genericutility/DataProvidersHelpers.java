package com.demowebshop.genericutility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProvidersHelpers {

	@DataProvider(name = "excelData")
	public Object[][] getData(String sheetName,int rowNum) throws EncryptedDocumentException, IOException
	{
		ExcelUtility eu = new ExcelUtility();
		
		return eu.getExcelData(sheetName, rowNum);
		
	}
}
