package com.Amokart.generic.common;

import com.Amazokort.genericexcelutility.ReadExcelFile;
import com.Amokart.generic.javautility.javautility;
import com.Amokart.generic.webdriverutility.webdriverUtility;
import com.amazo.propertyfileutilitys.readproperty;

public class objectUtility implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public javautility javaobj;
	public readproperty rpfobj;
	public webdriverUtility wduobj;
	 
	
	
	
	
	
	public void objectCreation() {
		 excelobj=new ReadExcelFile();
		 javaobj=new javautility();
		 rpfobj=new readproperty();
		wduobj=new webdriverUtility();
		
	}

}
