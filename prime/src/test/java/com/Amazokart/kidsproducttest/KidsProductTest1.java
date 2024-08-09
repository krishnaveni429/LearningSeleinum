package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest1 {
	@Test (priority = 3,dependsOnMethods = "addproduct",enabled = false, groups = "smoke")
	public void deleteProduct() {

		Reporter.log("deleteproduct--Electronic PRD 1 Sucessfull",true);
	}
	@Test(priority = 2,dependsOnMethods = "addproduct", groups = "Functonality")
	public void updateproduct() {
		Reporter.log("updateproduct--Electronic PRD 1sucessfully", true);
	}
	@Test(priority = 1,invocationCount = 2, groups = "integration")
	public void addproduct() {
		Reporter.log("addproduct-- Electronic PRD  1Sucessfully", true);

}
}
