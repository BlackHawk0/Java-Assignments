/* Write a java program that finds the roots of a quadratic equation given that.
 * The program should prompt the user to enter values for a, b, and c and displays the result based on the discriminant.
 * If the discriminant is positive, display two roots. 
 * If the discriminant is 0, display one root.
 */


import java.util.Scanner;

public class QuadraticEquation {
	public static void main (String [] args) {
		Scanner eq = new Scanner (System.in);
		
		System.out.println("Enter a , b, c : ");
		double a = eq.nextDouble();
		double b = eq.nextDouble();
		double c = eq.nextDouble();
		
		

		    double discriminant = calculateDiscriminant(a, b, c);

		    if (discriminant > 0.0) {
		    	
		        double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
		        double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
		        System.out.println("The roots are " + root1 + " and " + root2);
		    } else if (discriminant == 0.0) {
		        double root1 = -b / (2.0 * a);
		        System.out.println("The root is " + root1);
		    } else {
		        System.out.println("The equation has no real roots.");
		    }

		}

		public static double calculateDiscriminant(double a, double b, double c) {
		    double discriminant = b * b - 4.0 * a * c;
		    return discriminant;
	}
	
}

	
		