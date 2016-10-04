/***
* BankOperations Interface - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.interfaces;

public interface BankOperations {
	
	/**
	 * Make a withdrawal from the bank account 
	 * @param amount Amount to withdraw
	 */
	public void withdrawMoney(double amount);

	/**
	 * Make a deposit to the bank account 
	 * @param amount Amount to deposit
	 */
	public void depositMoney(double amount);

}
