package completed;

public class HelloWorld {

	public static void main(String[] args) {
		Phone phone = new Phone("704", "837-5309");
		
		System.out.println("phone number:" + phone.getAreaCode() + 
				"-" + phone.getNumber());
		
		System.out.println("color=" + phone.getStyle().getColor());
		
	}
}
