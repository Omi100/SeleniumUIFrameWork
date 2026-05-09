package com.demowebshop.genericutility;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
		public String fetchDataFromKeyOfPropertiesFile(String key) throws IOException
		{
			//File file = new File("./src/test/resources/DWS_CommonData/CommonData.properties");
		
			//We Have Optimized the code by using FileInputStream(File file) --> it will internally create an object of File Class
			FileInputStream fis = new FileInputStream("./src/test/resources/DWS_CommonData/CommonData.properties");
			
			Properties prop = new Properties();
			
			prop.load(fis);
			
			// String value = prop.getProperty(key);
			
			return prop.getProperty(key); 
		}
		
		
}
