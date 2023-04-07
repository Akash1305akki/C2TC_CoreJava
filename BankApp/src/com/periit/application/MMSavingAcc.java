package com.periit.application;

import com.periit.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	
	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal) {
		System.out.println("In your saving account, Your account balance is: Rs." +accBal);
	}


	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}

	