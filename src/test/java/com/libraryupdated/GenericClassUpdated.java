package com.libraryupdated;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class GenericClassUpdated extends BaseClassUpdated{
	
	public static String configProp = BaseClassUpdated.sDirPath+"\\config_updated.properties";
	public static String readExcel = BaseClassUpdated.sDirPath+"\\Abof.xlsx";
	
	public static String getDataProperties(String key){
		Properties properties = new Properties();
		String sValue = null;
		
		try{
			
			FileInputStream fis = new FileInputStream(configProp);
			properties.load(fis);
			sValue = properties.getProperty(key);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return sValue;
	}
	
	public void handleKeyboard(){
		try{
			driver.hideKeyboard();
		}catch(Exception e){
			
		}
	}
	
	//Read data from the excelsheet
		public static String[] getExcelData(String TestcasesId) throws Exception{
			String SData[]=null;
			try{
				FileInputStream input=new FileInputStream(readExcel);
				Workbook wb=(Workbook)WorkbookFactory.create(input);
				Sheet sh=wb.getSheet("AbofLoginApplication");
				int row=sh.getLastRowNum();
				System.out.println("Rows: "+row);
				for(int i=1;i<=row;i++){
					if(sh.getRow(i).getCell(0).toString().equals(TestcasesId)){
						int cell=sh.getRow(i).getLastCellNum();
						System.out.println("cell: "+cell);
						SData=new String[cell];
						for(int j=0;j<cell;j++){
							SData[j]=sh.getRow(i).getCell(j).getStringCellValue();
						}
						break;
					}
					
				}
			}catch(Exception e){
				throw e;
			}
			return SData;
		}
		
		//Verify toast messages
		public static String verifyToastMessage(AppiumDriver driver) throws IOException, TesseractException {
			String result = null;
			File scfile = driver.getScreenshotAs(OutputType.FILE);
			ITesseract instance = new Tesseract();
			try {
				result = instance.doOCR(scfile);
				System.out.println("result: "+result);
			} catch (TesseractException e) {
				
				throw e;
			}
			return result;
		}
		

}
