/***
* PersonalAccount - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.subclasses;
import java.util.UUID;
import com.assignment_4.superclasses.BankAccount;

public class PersonalAccount extends BankAccount{
	
	/**
	 * PersonalAccount constructor 
	 */
	public PersonalAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Personal account";
		this.balance = 0;
	}

}
