package com.Amazokart.productTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class product_CommonTest {
	
	public void  addproduct() {
		Reporter.log("Addproduct--common PRD sucessfull",true);
	}
	@Test
	public void updateproduct()
	{
		Reporter.log("updatedproduct--common PRD sucessful",true);
	}
	@Test
	public void deleteproduct()
	{
		Reporter.log("deleteproduct--common PRD sucessfully", true);
	}

}
