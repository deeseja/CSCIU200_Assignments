package completed;

import java.util.Scanner;

public class GasMileage {
	// -----------------------------------------------------------------
	// Calculates fuel efficiency based on values entered by the
	// user.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		int miles;
		double gallons, mpg;

		Scanner scan = new Scanner(System.in);

		// get mileage from user
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();

		// get gallons used from user
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();

		scan.close();
		// calculate mpg
		mpg = miles / gallons;

		System.out.println("Miles Per Gallon: " + mpg);
	}
}