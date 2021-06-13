package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin {
	int num, Heads = 0, Tails = 0;
	void printHeadTail() {
		for (int i = 0; i < num; i++) {
			double result = Math.random();
			if (result > 0.5) {
				System.out.println("Heads");
				Heads++;
			} else {
				System.out.println("Tails");
				Tails++;
			}
		}
	}

	void PercentageHeadTails() {
		double headsPercentage = ((Heads * 100) / num);
		System.out.println("The Heads percentage is " + headsPercentage);

		double tailsPercentage = ((Tails * 100) / num);
		System.out.println("The Tails percentage is " + tailsPercentage);
	}

	public static void main(String[] args) {

		System.out.print(
				"Welcome to coin flip simulator program "
				+ "\nEnter the number of times you want to flip the coin : ");
		Scanner scan = new Scanner(System.in);
		FlipCoin myObj1 = new FlipCoin();
		myObj1.num = scan.nextInt();
		myObj1.printHeadTail();
		myObj1.PercentageHeadTails();
		scan.close();
	}
}
