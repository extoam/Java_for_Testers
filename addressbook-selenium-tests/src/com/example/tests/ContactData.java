package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobile;
	public String email;
	public String email2;

	public ContactData() {
		;
	}
	public ContactData(String firstname, String lastname, String address,
			String home, String mobile, String email, String email2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.email = email;
		this.email2 = email2;
	}
}