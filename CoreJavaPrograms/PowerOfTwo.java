package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
	int power;
	void PowerCalculation() {
		if (power <= 31) {
			double result = Math.pow(2, power);
			System.out.println("Answer is "+result);
		} else System.out.println("Invalid input. Please enter power less than 31.");
	}
	public static void main(String[] args) {
		System.out.print("Welcome to the program to calculate power of 2."
				+ "\nNOTE: Maximum permissible value of power is 31."
				+ "\nPlease enter the power : ");
		Scanner sc = new Scanner(System.in);
		PowerOfTwo myObj = new PowerOfTwo();
		myObj.power = sc.nextInt();
		sc.close();
		myObj.PowerCalculation();
		
	}
}
