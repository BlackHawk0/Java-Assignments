//importing the java.util.Scanner package. this is important to obtain input from the user
import java.util.Scanner; 

public class Shipping {
	
	public static void main (String [] args) {
		Scanner wght = new Scanner (System.in);
		
		// Promoting the user to enter the weight in pounds.
		
		System.out.println("Enter the weight of your package in Pounds : ");
		
		double weight = wght.nextInt();
		
		if (weight > 50){
			System.out.println("The Package cannot be shipped");
			
		}
		else 
			//if the weight is less than 50 package
		{
			double costPerPound;
		
			if(weight > 0 && weight <= 20)
				costPerPound = 3.5;
			else if (weight <= 3)
				costPerPound = 5.5;
			else if (weight <= 10)
				costPerPound = 8.5;
			else // if the weight is <=20
				costPerPound = 10.5;
			System.out.println("The shipping cost of your package is : $" + costPerPound * weight);
		}
		
	}

}
