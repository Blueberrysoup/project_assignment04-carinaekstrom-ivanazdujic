/***
* Main - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.main;
import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

public class Main {

	/**
	 * Main class - demonstrate the functionality of BankAccount, PersonalAccount and SavingAccount classes.
	 */
	public static void main(String[] args) {
		String account = "";
		
		BankCustomer bc = new BankCustomer("Carina", 47);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.00 to the first account");
		bc.depositToAccount(account, 30.00);
		System.out.println(bc.toString());

		System.out.println("Withdrawing 200.0 from the second account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawMoneyFromAccount(account, 200.0);
		System.out.println(bc.toString());

		System.out.println("Depositing 200.0 to the third account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}
