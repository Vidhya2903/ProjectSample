package org.baseloc;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
		public WebElement getBtnLogin() {
		return btnLogin;
	}
		@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
		private WebElement btnLogin;
		
		@FindBy(name="q")
		private WebElement searchItem;
		
		@FindBy(xpath="//div[text()='IAIR Basic Feature Dual Sim Mobile Phone with 2800mAh Battery, 2.4 inch Display Screen, 0.8 mp Camera ...']")
		private WebElement firstLink;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
		private WebElement addCart;
		
		@FindBy(xpath="(//a[@class='_3hfHKJ'])[1]")
		private WebElement help;
		
		@FindBy(xpath="//div[@class='djVnmW _3v1CTV']")
		private WebElement view ;
		
//		
//		public WebElement getTxtUsername() {
//			return txtUsername;
//		}
//		
//		public WebElement getTxtPassword() {
//			return txtPassword;	
//		}
//		
//		public WebElement getBtnLogin() {
//			return btnLogin;

		public WebElement getView() {
			return view;
		}
		public WebElement getHelp() {
			return help;
		}
		public WebElement getAddCart() {
			return addCart;
		}
		public WebElement getSearchItem() {
			return searchItem;
		}
		public WebElement getFirstLink() {
			return firstLink;
		}
			
		}
	

