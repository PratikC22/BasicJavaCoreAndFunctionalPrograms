package com.bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
	double result; int i, num;
	void HarmonicNum() {
		for (i = 1; i<=num; i++) {
			if ( i!=num) {
                System.out.print("1/" +i+ " + ");
            }
            else System.out.println("1/" + i);
		}
		for (i=2; i<=num; i++) {
			result = result + (double) 1 / num;
		}
		System.out.println(+num+" Harmonic value is "+result);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to print nth harmonic number."
				+ "\nPlease enter a number.");
		Scanner sc = new Scanner(System.in);
		HarmonicNumber myObj = new HarmonicNumber();
		myObj.num = sc.nextInt();
		sc.close();
		myObj.HarmonicNum();
	}
}
