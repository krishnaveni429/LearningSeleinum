package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest2 {
	@Test(invocationCount = 2,groups = "integration")
	public void addProduct() {
		Reporter.log("addproduct--Electronic PRD 2 Sucessfull",true);
	}
	@Test(invocationCount = 2,groups = "functionality")
	public void updateproduct() {
		Reporter.log("updateproduct--Electronic PRD 2 sucessfully", true);
	}
	@Test(invocationCount = 2,groups = "smoke")
	public void deleteproduct() {
		Reporter.log("deleteproduct-- Electronic PRD  2Sucessfully", true);

}
}

