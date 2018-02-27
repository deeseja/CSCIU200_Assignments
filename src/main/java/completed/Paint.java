package completed;

import java.util.Scanner;
// 5 for general syntax
// 5 for compiling
// 3 for github upload
// 5 for correct output
// 3 for calculation

/*Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height */
public class Paint {
	public static void main(String[] args) {
		final int COVERAGE = 350;
		int length, width, height;
		double totalSqFt;
		double paintNeeded;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of the room:");
		length = scanner.nextInt();
		
		System.out.print("Enter width of the room:");
		width = scanner.nextInt();
		
		System.out.print("Enter height of the room:");
		height = scanner.nextInt();
		
		totalSqFt = (2* width * height) +(2 * length * height);
		paintNeeded = totalSqFt / COVERAGE;
		
		System.out.println("Size of the room:" + totalSqFt);
		System.out.println("Paint needed:" + paintNeeded + " gallons");
		scanner.close();
	}
}