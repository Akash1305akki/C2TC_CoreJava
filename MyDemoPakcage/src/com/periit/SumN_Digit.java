package com.periit;
import java.util.*;

public class SumN_Digit {
	
	private int sum;

    public SumN_Digit(int n) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        System.out.println("The sum of the entered numbers is " + sum);
    }

}
