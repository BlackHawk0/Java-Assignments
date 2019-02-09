
//Write a program that generates two random integer numbers and prompts the user to enter the sum of these two integers, 
//then tell the user if the entered value is correct or not.


import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		//Generates a random number between 0 and 500
		
		int random = (int)(Math.random() * 500);
		
		// Generates a second random number
		
		int secondRandom = (int)(Math.random()* 500);
		
		// prints the two random numbers generated
		
		System.out.println("The first random number is :" + random );
		
		System.out.println("The second random number is :" + secondRandom);
		
		Scanner rnd = new Scanner (System.in);
		
		//prompts the user to enter the sum of the two random integers. 
		
		System.out.println("Enter the sum of the 2 intergers :");
		
		int users = rnd.nextInt();
		
		int answer = random + secondRandom;
		
		//checks if the user input is correct and displays the correct answer.
		
		if (users == answer) {
			System.out.println("You got it right, the answer is :" + answer);
		}
		else
		{
			System.out.println("You got it wrong, the correct anser is : " + answer);
		}
		

	}

}
