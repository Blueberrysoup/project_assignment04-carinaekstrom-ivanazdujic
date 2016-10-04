/***
* BankCustomer - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.subclasses;
import java.util.ArrayList;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human{

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * BankCustomer constructor 
	 * @param name Bank customer's name
	 * @param age Bank customer's age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * Get customer accounts 
	 * @return customerAccounts ArrayList of BankAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Set customer accounts 
	 * @param customerAccounts ArrayList of BankAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * Add a new bank account to bank customer's list of accounts 
	 * @param bankAccount ArrayList of BankAccounts
	 */
	public void addAccount(BankAccount bankAccount){
		customerAccounts.add(bankAccount);
	}
	
	/**
	 * Make a deposit to a bank account 
	 * @param accountNumber Number of account to make the deposit to
	 * @param amount Amount to deposit
	 */
	public void depositToAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	
	/**
	 * Make a withdrawal from a bank account 
	 * @param accountNumber Number of account to make the withdrawal from
	 * @param amount Amount to withdraw
	 */
	public void withdrawMoneyFromAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}		
	}
	
	/**
	 * Collect information on a customer and his/her bank accounts 
	 * @return String with customer/account information
	 */	
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		
		returnString.append("Customer: " + getName() + ",  Age: " + getAge() + "\n");
		for (int i = 0; i < customerAccounts.size(); i++)
			returnString.append(customerAccounts.get(i).toString() + "\n");
			
		return returnString.toString();
	}
	
}
