package com.periit;
import java.util.Scanner;
public class InputClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers to be added: ");
        int n = input.nextInt();
        SumN_Digit sumObj = new SumN_Digit(n);

	}

}
