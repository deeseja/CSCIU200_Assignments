package completed;

//Program Rock.java contains a skeleton for the game Rock, Paper, Scissors. 
//Add statements to the program as 
//indicated by the comments so that the program asks the user to enter a play, 
//generates a random play for the computer, compares them and announces the 
//winner (and why). For example, one run of your program might look like this:
//$ java Rock
//Enter your play: R, P, or S
//Computer play is S
//Rock crushes scissors, you win!

//************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock {
	public static void main(String[] args) {
		String personPlay; // User's play -- "R", "P", or "S"
		String computerPlay; // Computer's play -- "R", "P", or "S"
		int computerInt; // Randomly generated number used to determine computer's play

//		 Get person's play -- note that this is stored as a string
//		 Make person's play uppercase for ease of comparison
//		 Generate computer's play (0,1,2)
//		 Translate computer's randomly generated play to string
		
		Random generator = new Random();
		computerInt = generator.nextInt(3);
		switch (computerInt)
		{
		case 0:
			computerPlay = "R";
		case 1:
			computerPlay = "P";
		case 2:
			computerPlay = "S";
		}
		// Print computer's play
		// See who won. Use nested ifs instead of &&.
		 if (personPlay.equals(computerPlay))
			 System.out.println("It's a tie!");
		 else if (personPlay.equals("R"))
		 if (computerPlay.equals("S"))
		 System.out.println("Rock crushes scissors. You win!!");
		 else
		 Scanner scan = new Scanner(System.in);
		 
	}
	// ... Fill in rest of code
}