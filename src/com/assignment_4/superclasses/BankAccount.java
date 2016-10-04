/***
* BankAccount - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.superclasses;
import java.util.UUID;
import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	protected String accountNumber = "";
	protected double balance = 0.0;
	protected String accountType = "";

	/**
	 * BankAccount constructor 
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}
	
	/**
	 * Get account number
	 * @return accountNumber Unique number of the bank account
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Set account number
	 * @param accountNumber Unique number of the bank account
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Get balance
	 * @return balance Current balance of the bank account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Set balance
	 * @param balance Current balance of the bank account.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Get account type
	 * @return accountType Type of bank account. Type can be Bank account, Saving account or Personal account.
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Set account type
	 * @param accountType Type of bank account. Type can be Bank account, Saving account or Personal account.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Collect information on the bank account
	 * @return String with bank account information
	 */	
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType	+ "]";
	}

	/**
	 * Make a withdrawal from the bank account 
	 * @param amount Amount to withdraw
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0){							//You can not withdraw a negative amount but it's  ok to have a negative balance
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can not withdraw a negative amount");
		}
	}

	/**
	 * Make a deposit to the bank account 
	 * @param amount Amount to deposit
	 */
	public void depositMoney(double amount) {
		if (amount >= 0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative amount");
		}
	}

}
