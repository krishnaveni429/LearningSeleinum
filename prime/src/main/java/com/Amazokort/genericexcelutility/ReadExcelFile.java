package com.Amazokort.genericexcelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadExcelFile {
	
	
	private static final String ExcelPath = null;
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;

public String readdata(String sheet,int row,int column) {
			//convert the physical excel file into java understandable
			
			try {
				fis = new FileInputStream(ExcelPath);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			//create the workbook
			try {
				wb=WorkbookFactory.create(fis);
				}
			catch (EncryptedDocumentException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			//usingWorkBook go to sheet,row,column and cell fetch the data
			String data=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			
			return data;
          }
			
			public void writedata(String sheet, int row, int column, String data) throws EncryptedDocumentException, IOException {
				
				try {
					fis=new FileInputStream(ExcelPath);
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				
				//create the workbook
				wb=WorkbookFactory.create(fis);
				
				//create a new column and write data on it
				wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
				
				//convert java data into physical file
				fos=new FileOutputStream(ExcelPath);
				
				//write the data
				wb.write(fos);
				
				//close the workbook
				wb.close();
			}
			
          public void diaplaydata(String sheet, int row,int column)   {
        	  //convert the physical excel file into java understandable
        	  try {
        		  fis=new FileInputStream(ExcelPath);
        	  }
        	  catch(FileNotFoundException e) {
        		  e.printStackTrace();
          }
        	  //create the workbook
        		  try {
					wb=WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
        	  
        	  //usingworkbook go to sheet,row,column and cell fetch the data
        	  String data=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
        	  
        	  //print the data
        	  System.out.println(data);
        	  }
          
          
          public void displaymultipledata(String sheet, int column) {
        	  //convert the physical excel file into java understandable
        	  
        	  try {
        		  fis=new FileInputStream(ExcelPath);
        	  } catch(FileNotFoundException e) {
        		  e.printStackTrace();
        	  }
        	  // create the workbook
        	  try {
        		  wb=WorkbookFactory.create(fis);
        	  }
        	  catch(EncryptedDocumentException e) {
        		  e.printStackTrace();
        	  }
        	  catch(IOException e) {
        		  e.printStackTrace();
        	  }
        	  
        	  //usingworkbook go to sheet
        	  org.apache.poi.ss.usermodel.Sheet sht=wb.getSheet(sheet);
        	  
        	  int count=sht.getLastRowNum();
        	
        	  for (int i=1; i<=count; i++) {
        		  
        		  //optimized code
        		  String data=wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
        		 System.out.println(data);
        	  }
          }
}

	
	
			
			
		
	
	
	


