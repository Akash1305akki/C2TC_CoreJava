package com.periit.framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accName;
	private float accBal;
	

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	
	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	
	
	public void withdraw(float amt) {
		System.out.println("Your account balance before withdrawing is Rs."+accBal);
		accBal = accBal - amt;
		System.out.println("Your account balance after withrawing RS."+amt+" is "+accBal);
	}

	
	public void deposit(float amt) {
		System.out.println("Your account balance before depositing is: Rs."+accBal);
		accBal = accBal + amt;
		System.out.println("Your account balance after depositing RS."+amt+" is: RS."+accBal);
	}


	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
