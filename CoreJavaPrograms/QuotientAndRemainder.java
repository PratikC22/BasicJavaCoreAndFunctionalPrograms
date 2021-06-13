package com.bridgelabz;
import java.util.Scanner;

public class QuotientAndRemainder {
	double dividend, divisor;
	
	void Division() {
		double quotient = dividend / divisor;
		double remainder = dividend % divisor;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder ="+remainder);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to compute quotient And remainder."
				+ "\nPlease Enter dividend and divisor : ");
		Scanner sc = new Scanner(System.in);
		QuotientAndRemainder myObj = new QuotientAndRemainder();
		myObj.dividend = sc.nextDouble();
		myObj.divisor = sc.nextDouble();
		sc.close();
		myObj.Division();
	}
}
