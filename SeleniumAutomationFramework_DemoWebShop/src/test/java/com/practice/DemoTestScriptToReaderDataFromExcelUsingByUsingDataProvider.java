package com.practice;

import org.testng.annotations.Test;

public class DemoTestScriptToReaderDataFromExcelUsingByUsingDataProvider {
	
	@Test(dataProvider="excelData",dataProviderClass="DataProvidersHelpers.class")
	public void readTheDataFromExcel()
	{
		
	}
}
