package exercises;

import java.text.NumberFormat;

public class EmployeeDriver {

	public static void main(String[] args) {
		// Create the Employee class to support the 
		// methods used below.
		Employee employee = new Employee();
		
		employee.setFirstName("Fred");
		employee.setLastName("Smith");
		employee.setSalary(50000);
		
		// should print out the following:
		// Fred Smith
		// salary: $50,000.00
		System.out.println(employee);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("salary:" + formatter.format(employee.getSalary()));
	}

}
