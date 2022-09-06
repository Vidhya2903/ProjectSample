package org.test;

import java.awt.AWTException;

import org.base.BaseClass;
import org.baseloc.LoginPage;

public class SampleClass extends BaseClass{
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		implicitlywait(20);
		
		LoginPage l=new LoginPage();
		click(l.getBtnLogin());
		
		click(l.getSearchItem());
		sendkeys(l.getSearchItem(),"mobile");
		keyEnter();
		
		click(l.getFirstLink());
		
		getWindowsHandles(1);
		
		click(l.getAddCart());
		
		click(l.getHelp());
		
		click(l.getView());
	}

	
		
	}

	
		
	


