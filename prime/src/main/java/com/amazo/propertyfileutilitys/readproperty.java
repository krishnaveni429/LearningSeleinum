package com.amazo.propertyfileutilitys;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amokart.generic.common.FrameworkConstant;

public class readproperty implements FrameworkConstant {
	
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	public String readdata(String key)  {
	 try {
		fis=new FileInputStream(propertypath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	p=new Properties();
	try {
		p.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p.getProperty(key);
	
	}
	public void writeData(String key, String value)  {
		p.put(key, value);
		try {
			fos=new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.store(fos, " Updated the new key-value sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void displaydata(String key) {
		try {
			fis=new FileInputStream("C:\\Users\\krish\\OneDrive\\Documents\\Student.xlsx");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		p=new Properties();
		String data=p.getProperty(key);
	}
}

	

