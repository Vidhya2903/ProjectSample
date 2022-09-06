package org.baseloc;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage extends BaseClass {
	public  Registrationpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btncreate;
	public WebElement getBtncreate() {
		return btncreate;
	}
	@FindBy(name="firstname")
	private WebElement Firstname;
	public WebElement getFirstname() {
		return Firstname;
	}
	@FindBy(name="lastname")
	private WebElement Lastname;
	public WebElement getLastname() {
		return Lastname;
	}
	@FindBy(name="reg_email__")
	private WebElement mobileno;
	public WebElement getMobileno() {
		return mobileno;
	}
	@FindBy(name="reg_passwd__")
	private WebElement newpasswd;
	public WebElement getNewpasswd() {
		return newpasswd;
	}
	
}
