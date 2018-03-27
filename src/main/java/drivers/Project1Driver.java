package drivers;

import java.util.Random;

public class Project1Driver {

	public static void main(String[] args) {

		for (int i = 0 ; i <= 10000; i++) {
			Random random = new Random();
			int next = random.nextInt(6) + 1;
			System.out.println(next);
			if (next == 0) {
				System.out.println("this is broken");
				break;
			}
			if (next == 6) {
				System.out.println("it has a 6");
				break;
			}
		}
	}

}
