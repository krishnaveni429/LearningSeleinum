package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest3 {
	@Test(groups = "integration")
	public void addProduct() {
		Reporter.log("addproduct--Electronic PRD 3 Sucessfull",true);
	}
	@Test(invocationCount = 0,dependsOnMethods = "addproduct",groups = "functionality")
	public void updateproduct() {
		Reporter.log("updateproduct--Electronic PRD 3 sucessfully", true);
	}
	@Test(enabled = false, dependsOnMethods = "addproduct",groups = "smoke")
	public void deleteproduct() {
		Reporter.log("deleteproduct-- Electronic PRD 3 Sucessfully", true);

}
}

