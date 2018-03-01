package completed;

import java.util.Scanner;

public class Customer {
	private String firstName;
	private String lastName;
	private int pin;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what pin would you prefer:");
		pin = scanner.nextInt();
		scanner.close();
	}
	
	public int getPin() {
		return pin;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}

}
