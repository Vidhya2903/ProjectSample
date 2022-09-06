package org.hotel;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class AdactinBase extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		browserLaunch("chrome");
		urlLaunch("http://adactinhotelapp.com/");
		implicitlywait(20);
		
       PomAdactin p=new PomAdactin();
       sendkeys(p.getSearchItem(), readExcel("sheet2","sheet1",1,0));
       sendkeys(p.getTxtPassword(), readExcel("sheet2","sheet1",1,1));
       readExcel("sheet","sheet", 1, 1);
       click(p.getLogin());
       selectByIndex(p.getLocation(), 2);
       selectByIndex(p.getHotels(), 2);
       selectByIndex(p.getRoom(), 2);
       selectByIndex(p.getRoomno(), 2);
       clear(p.getDatein());
       sendkeys(p.getDatein(),readExcel("sheet2","sheet1",1,2));
       clear(p.getDateout());
       sendkeys(p.getDateout(), readExcel("sheet2","sheet1",1,3));
       selectByIndex(p.getAdult(), 2);
       selectByIndex(p.getChild(), 2);
       click(p.getSubmit());
       click(p.getRadiobtn());
       click(p.getContinuebtn());
       sendkeys(p.getFirst(), readExcel("sheet2","sheet1",1,4));
       sendkeys(p.getLast(), readExcel("sheet2","sheet1",1,5));
       sendkeys(p.getAddress(), readExcel("sheet2","sheet1",1,6));
	   sendkeys(p.getCredit(), readExcel("sheet2","sheet1",1,7));
	   selectByIndex(p.getCardtype(), 2);
	   selectByIndex(p.getExpmonth(), 9);
	   selectByIndex(p.getExpyear(), 12);
	   sendkeys(p.getCvvnum(), "614");
	   click(p.getBook());
	   Thread.sleep(5000);
	   String orderid = getAttribute(p.getOrder());
		System.out.println("order id is"+ orderid);
	}

	
		
	}

	
		
	

