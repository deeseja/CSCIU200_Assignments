package drivers;

import completed.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
		// Create the Employee class to support the 
		// methods used below.
		Customer customer = new Customer("Tanya", "West");
		
		// should print out the following:
		// Tanya West
		System.out.println(customer);

		customer.setFirstName("Fred");
		customer.setLastName("Smith");
		
		// should prompt for a PIN entry and set it
		customer.setPin();
		int number = 2;
		if (customer.getPin() != 1000 || false)
			System.out.println("PIN must be at least 4 characters");
			System.out.println(number);
	}

}
