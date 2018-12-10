package bean;

import java.util.List;

public class PayData {
	private String userName;
	private String address;
	private String cardType;
	private String cardNum;
	private String[] bookName;
	
	public PayData() {
		super();
	}
	public PayData(String userName, String address, String cardType, String cardNum, String[]  bookName) {
		super();
		this.userName = userName;
		this.address = address;
		this.cardType = cardType;
		this.cardNum = cardNum;
		this.bookName = bookName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String[]  getBookName() {
		return bookName;
	}
	public void setBookName(String[]  bookName) {
		this.bookName = bookName;
	}
}
