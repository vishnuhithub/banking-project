package com.example.entity;

public class AccDetails {


	private int id;
	private String first_name;
	private String last_name;
	private String phone_no;
	private String pancard;
	private String adharcard;
	private String address;
	private double balance;

	public AccDetails(String first_name, String last_name,String pancard,String adharcard, String phone_no, String address, double opening_balance) {
		super();
	//	this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_no = phone_no;
		this.pancard = pancard;
		this.adharcard = adharcard;
		this.address = address;
		this.balance = opening_balance;
	}
	
	public AccDetails() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfirst_name() {
		return first_name;
	}

	public String getlast_name() {
		return last_name;
	}


	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public void setadharcard(String adharcard) {
		this.adharcard = adharcard;
	}
	public String getadharcard() {
		return adharcard;
	}
	public String getpancard() {
		return pancard;
	}

	

	public void setpancard(String pancard) {
		this.pancard = pancard;
	}



	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccDetails [id :" + id + ", first_name : " + first_name + ",last_name : " + last_name + ", phone_no : " + phone_no +",pancard:"+pancard+",adharcard :"+adharcard+", address : "+address+", balance : " +balance+"]";
}

}