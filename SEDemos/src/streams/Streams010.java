package streams;

import java.util.List;
import java.util.LinkedList;

/**
 * How many elements remain in the list in the end ?
 * 
 * @author soufrk
 */ 
public class Streams010 {

	public static void main(String... args) {
		List<Double> listOfValues = new LinkedList(){{
			add(1.2);
			add(2.3);
			add(3.4);
			add(4.5);
			add(5.6);
			add(6.7);
			//add(null);
		}};
		listOfValues.stream()
			.filter(u->u>5.0)
			.peek(u->listOfValues.remove(u));
		System.out.println(listOfValues.size());
	}

}
