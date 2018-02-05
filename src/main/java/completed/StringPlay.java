package completed;

// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
public class StringPlay {

	public static void main(String[] args) {
		String college = new String("USC Upstate College");
		// (a) declare the variable town as a reference to a String 
		// object and initialize it to "Anytown, USA".
		String town = "Anytown, USA";
		
		// (b) write an assignment statement that invokes the length 
		// method of the string class to find the length of the college
		// String object and assigns the result to the stringLength variable
		int stringLength = college.length();
		
		String change1, change2, change3;
		// (c) complete the assignment statement so that change1 
		// contains the same characters as college but all in upper case 
		change1 = college.toUpperCase();
		
		// (d) complete the assignment statement so that change2 is the same
		// as change1 except all capital O's are replaced with the asterisk (*) 
		// character.
		change2 = change1.replace('O', '*');
		
		// (e) complete the assignment statement so that change3 is the 
		// concatenation of college and town (use the concat method of the 
		// String class rather than the + operator)
		change3 = college.concat(town);
		
		System.out.println("stringLength:" + stringLength);
		System.out.println("change1:" + change1);
		System.out.println("change2:" + change2);
		System.out.println("change3:" + change3);
	}
}

