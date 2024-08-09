package com.amazakart.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrtieDataToExcel {
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Data/testdata.xlsx");
        Workbook w=WorkbookFactory.create(fis);
        String data=w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       
        w.getSheet("Sheet1").getRow(0).createCell(4).setCellValue("Status");
        w.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("FAIL");
        FileOutputStream fos=new FileOutputStream("./src/test/resources/Data/testdata.xlsx");
        w.write(fos);
        w.close();
System.out.println(data);		
	}

}


