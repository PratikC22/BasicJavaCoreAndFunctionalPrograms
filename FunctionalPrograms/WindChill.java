/**
 * Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
 * temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
 * 	wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75 )* Math.pow(v, 0.16);
 * Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
 * than 120 or less than 3 (you may assume that the values you get are in that range).
 * 
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */

package FunctionalPrograms;

public class WindChill {
	
	private static void Wind(double t,double v) {
		if (t > 50 || v > 120 || v < 3) {
			System.out.println("Invalid input!");
		} else {
			double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75 )* Math.pow(v, 0.16);
	        System.out.println("The wind chill value is: " +wind+ " units.");
		}
    }
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		Wind(t,v);
	}

}
