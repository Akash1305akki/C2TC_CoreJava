package com.periit.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private float creditLimit;
	
	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
        this.creditLimit = creditLimit;		
	}
	
	public float getCreditLimit() {
        return creditLimit;
    }
	
	@Override
	public void withdraw(float amt) {
		if(getAccBal() + creditLimit < amt) {
		System.out.println("Succesfully withdrawed Rs."+amt+" from your current account");
		}
		else {
			System.out.println("Creddit Limit Exceeded");
		}
	}

	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

	
