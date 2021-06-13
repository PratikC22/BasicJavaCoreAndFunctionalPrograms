package com.bridgelabz;
import java.util.Scanner;

public class EvenOrOdd {
	double num, result;
	void CheckNum() {
		result = num % 2;
		if (result == 0 ) {
			System.out.println(+num +" is Even.");
		} else System.out.println(+num +" is Odd.");
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to check if number is even or odd.\nPlease enter a number :");
		Scanner sc = new Scanner(System.in);
		EvenOrOdd myObj = new EvenOrOdd();
		myObj.num = sc.nextDouble();
		sc.close();
		myObj.CheckNum();
		
	}
}
