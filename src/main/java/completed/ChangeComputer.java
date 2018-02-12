package completed;

import java.util.Scanner;

public class ChangeComputer {

	public static void main(String[] args) {
		Scanner scanner = null;
		// Write a program that will prompt for input of some number of cents 
		// (less than 100) and output the number of quarters, dimes, 
		// nickels and pennies needed to add up to that amount.
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter number of cents equal to or equal to 100:  ");
			int totalEntered = scanner.nextInt();

			int quarters = totalEntered / 25;
			int remainder = totalEntered % 25;
			
			int dimes = remainder / 10;
			remainder = remainder % 10;
			
			int nickels = remainder / 5;
			remainder = remainder % 5;
			
			int pennies = remainder / 1;

			System.out.println("quarters:" + quarters);
			System.out.println("dimes:" + dimes);
			System.out.println("nickels:" + nickels);
			System.out.println("pennies:" + pennies);
			
		} finally {
			scanner.close();
		}
	}

}
