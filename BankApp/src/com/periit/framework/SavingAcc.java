package com.periit.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private static final float MINBAL = 800.00f;
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public void isSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	/**
	 * @return the MINBAL
	 */
	public static float getMinbal() {
		return MINBAL;
	}
	
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float amt) {
		if(getAccBal() > MINBAL) {
			System.out.println("Succesfully withdrawed Rs."+amt+" from your saving account");
		}
		else {
			System.out.println("Minimum balance limit does'nt satisfied");
		}
	}



	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
