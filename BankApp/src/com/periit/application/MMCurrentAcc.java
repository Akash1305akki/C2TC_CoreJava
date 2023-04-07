package com.periit.application;

import com.periit.framework.CurrentAcc;
//import com.periit.framework.SavingAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		System.out.println("In your current account, the account balance is: "+getAccBal()+"\nand the credit limit is: "+creditLimit);
	}


	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

	