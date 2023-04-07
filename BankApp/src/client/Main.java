package client;

import com.periit.application.*;
import com.periit.framework.*;


public class Main {
    public static void main(String[] args) {
        // Create an instance of MMBankFactory
        BankFactory factory = new MMBankFactory();

        // Creating a Savings Account
    	SavingAcc savingAcc = new MMSavingAcc(77777, "Akash", 20000.66f, true);
    	
    	// Calling My Withdraw and ToString Methods for my savings account
    	savingAcc.withdraw(savingAcc.getAccBal());
    	savingAcc.deposit(5000.00f);
    	savingAcc.withdraw(savingAcc.getAccBal());
    	savingAcc.toString();
    	
    	System.out.println("---------------------------------------------------------------");
    	
    	// Creating a Current Account
		CurrentAcc currentAcc = new MMCurrentAcc(18181, "Praveen Raj", 10000.00f, 2000f);
		
		// Calling My Withdraw and ToString Methods for my current account
		currentAcc.withdraw(currentAcc.getCreditLimit());
		currentAcc.deposit(5000.00f);
		currentAcc.withdraw(currentAcc.getAccBal());		
		currentAcc.toString();
    }
}
