package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAdactin extends BaseClass {

	public  PomAdactin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement txtUsername;

	public WebElement getSearchItem() {
		return txtUsername;
	}
	
	@FindBy(name="password")
	private WebElement txtPassword;

	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(name="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(name="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(name="room_type")
	private WebElement room;

	public WebElement getRoom() {
		return room;
	}
	
	@FindBy(name="room_nos")
	private WebElement roomno;

	public WebElement getRoomno() {
		return roomno;
	}
    
	@FindBy(name="datepick_in")
	private WebElement datein;

	public WebElement getDatein() {
		return datein;
	}

	@FindBy(name="datepick_out")
	private WebElement dateout;

	public WebElement getDateout() {
		return dateout;
	}
	
	@FindBy(name="adult_room")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}
	
	@FindBy(name="child_room")
	private WebElement child;

	public WebElement getChild() {
		return child;
	}
	
	@FindBy(name="Submit")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
	@FindBy(name="continue")
	private WebElement continuebtn;

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	@FindBy(name="first_name")
	private WebElement first;

	public WebElement getFirst() {
		return first;
	}
	
	@FindBy(name="last_name")
	private WebElement last;

	public WebElement getLast() {
		return last;
	}
	
	@FindBy(name="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(name="cc_num")
	private WebElement credit;

	public WebElement getCredit() {
		return credit;
	}
	
	@FindBy(name="cc_type")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	
	@FindBy(name="cc_exp_month")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}

	@FindBy(name="cc_exp_year")
	private WebElement expyear;

	public WebElement getExpyear() {
		return expyear;
	}
	
	@FindBy(name="cc_cvv")
	private WebElement cvvnum;

	public WebElement getCvvnum() {
		return cvvnum;
	}
	
	@FindBy(name="book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}
	
	@FindBy(name="order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}
	
	}
	
	


