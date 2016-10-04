/***
* Human - Exercise 1/Assignment 4. 20160930
* @author: Carina Ekström, Ivana Zdjuic
* @version: 1.0
**/

package com.assignment_4.superclasses;

public class Human {
	private String name = "";
	private int age = 0;
	
	/**
	 * Human constructor 
	 * @param name The person's name
	 * @param age The person's age
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Get name
	 * @return name The person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 * @param name The person's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get age
	 * @return age The person's age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set age
	 * @param age The person's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
