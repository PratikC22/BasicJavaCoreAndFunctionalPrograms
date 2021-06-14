/**
* Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
* Theformulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
* @author Pratik Chaudhari
* @since 14/06/2021
*/
package FunctionalPrograms;
import java.util.Scanner;

public class Distance {
	private static void EuclideanDistance(double x, double y) {
		double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The Euclidean distance from "+x+","+y+" to origin 0,0 is: " +distance+ " units.");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find euclidean distance.\nPlease enter value of x and y.");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		EuclideanDistance(x,y);
	}
}
