package com.bridgelabz;
import java.util.Scanner;

public class VowelOrConsonant {
	char a, e, i, o, u, alpha;
	void CheckAlpha() {
		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
			System.out.println(alpha+" is a vowel.");
		} else System.out.println(alpha+" is a consonant.");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to check if alphabet is a vowel or a consonant.\nPlease enter an alphabet.");
		Scanner sc = new Scanner(System.in);
		VowelOrConsonant myObj = new VowelOrConsonant();
		myObj.alpha = sc.next().charAt(0);
		sc.close();
		myObj.CheckAlpha();
	}
}
