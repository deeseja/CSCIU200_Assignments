package completed;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Item> shoppingCart = new ArrayList<Item>();
		Item item1 = new Item();
		item1.setName("orange");
		
		Item item2 = new Item();
		item2.setName("orange");
		
		shoppingCart.add(item1);
		shoppingCart.add(item2);
		
		Iterator<Item> it = shoppingCart.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		for (Item item : shoppingCart) {
			System.out.println(item.getName());
		}
		
		int count = 0;
		while (count < shoppingCart.size()) {
			System.out.println(shoppingCart.get(count).getName());
			count++;
		}
		
		for (int counter = 0; counter < shoppingCart.size(); counter++) {
			System.out.println(shoppingCart.get(count).getName());
		}
		
	}
}
