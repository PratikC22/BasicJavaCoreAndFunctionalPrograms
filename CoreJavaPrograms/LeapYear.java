package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {
	int year;
	void LeapYearOrNot() {
		int count = 0; int digits = year;
		while (digits != 0) {
			digits = digits / 10;
			count +=1;
		}
		if (count == 4) {
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println(year+" is a Leap Year.");
			} else System.out.println(year+ " is not a leap year.");
		} else System.out.println("Invalid format. please enter year in YYYY format");
	}	
	public static void main(String[] args) {
		System.out.print("Welcome to the program to check leap year \nPlease enter the year in YYYY format : ");
		Scanner sc = new Scanner(System.in);
		LeapYear myObj = new LeapYear();
		myObj.year = sc.nextInt();
		sc.close();
		myObj.LeapYearOrNot();
	}
}
