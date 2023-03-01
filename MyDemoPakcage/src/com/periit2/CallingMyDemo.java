package com.periit2;
import java.util.Scanner;
import com.periit.*;

public class CallingMyDemo {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of integers to do sum operation: ");
        int x = ip.nextInt();
		SumN_Digit ipObj = new SumN_Digit(x);

	}

}
