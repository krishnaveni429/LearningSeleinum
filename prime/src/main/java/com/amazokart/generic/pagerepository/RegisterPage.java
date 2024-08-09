package com.amazokart.generic.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	@FindBy(id="name")
	private WebElement name;
	public WebElement getname() {
		return name;
	}
	@FindBy(xpath="//input[contains(@type,'email')]")
	private WebElement email;
	public WebElement getmail() {
		return email;
	}
	@FindBy(xpath="//form[@target='_blank']/fieldset/table/tbody/tr[3]/td[2]/input")
	private WebElement password;
	public WebElement getpassword() {
		return email;
	}
	@FindBy(xpath="//input[@type='tel' and @id='mobile']")
	private WebElement dob;
	public WebElement getdob()
	{
		return dob;
		
	}
	@FindBy(xpath="//tbody/tr[6]/td/following-sibling::td//input[2]")
	private WebElement female;
	public WebElement getfemale()
	{
		return email;
		
		
		
	}

}
