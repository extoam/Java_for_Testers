package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  
  @Test
  public void testNonEmptyContactCreation() throws Exception {
    openMainPage();
    gotoContactCreation();
    ContactData contact = new ContactData();
	contact.firstname = "first name 1";
	contact.lastname = "last name 1";
	contact.address = "address";
	contact.home = "home";
	contact.mobile = "mobile";
	contact.email = "email";
	contact.email2 = "email2";
    fillContactForm(contact);
    
    selectBirthDate("11");
    selectBirthMonth("August");
    fillBirthYear("year");
    selectGroupName("group name 1");
    ContactSecondData contactSecond = new ContactSecondData();
    contactSecond.phone2 = "phone2";
    contactSecond.address2 = "address2";
	fillSecondForm(contactSecond);
    submitContactCreation();
    returnHomePage();
    
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
    openMainPage();
    gotoContactCreation();
    fillContactForm(new ContactData("", "", "", "", "", "", ""));
    selectBirthDate("-");
    selectBirthMonth("-");
    fillBirthYear("");
    selectGroupName("[none]");
    fillSecondForm(new ContactSecondData("", ""));
    submitContactCreation();
    returnHomePage();
  }

}

