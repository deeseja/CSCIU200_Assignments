package completed;

import java.util.Scanner;

public class Customer {
	private String firstName;
	private String lastName;
	private int pin;
	private Scanner scanner;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		scanner = new Scanner(System.in);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPin() {
		System.out.println("what pin would you prefer:");
		pin = scanner.nextInt();
	}
	
	public int getPin() {
		return pin;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void destroy() {
		scanner.close();
	}

}
