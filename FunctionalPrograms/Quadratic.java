/**
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 * can be found using a formula (Note: Take a, b and c as input values) delta = b*b - 4*a*c.
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * 
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package FunctionalPrograms;
import java.util.Scanner;

public class Quadratic {
	private static void Roots(int a, int b, int c) {
		double delta = (b * b) - 4 * a * c;
		if ( delta < 0 ) {
			System.out.println("This equation has imaginary roots");
		} else {
		double root1 = (-b + Math.sqrt(delta))/(2 * a);
		double root2 = (-b - Math.sqrt(delta))/(2 * a);
		System.out.println("Delta = "+delta);
		System.out.println("Root1 = "+root1);
		System.out.println("Root2 = "+root2);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find roots of quadratic equation a*x*x + b*x + c.");
		System.out.println("Please enter value of a,b and c.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		Roots(a,b,c);
	}
}
