package com.periit.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit);

}
