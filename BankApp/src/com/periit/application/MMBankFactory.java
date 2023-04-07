package com.periit.application;

import com.periit.framework.BankFactory;
import com.periit.framework.CurrentAcc;
import com.periit.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mySavingAccount = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mySavingAccount;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc myCurrentAccount = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return myCurrentAccount;
	}

}
