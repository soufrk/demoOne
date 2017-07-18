package concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Iterator is fail-fast. Is the behaviour similar with a
 * concurrent collection as well.
 * @author soufrk
 *
 */
public class IteratorOnConcurrency {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		//ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		Iterator<Integer> iterator = list.iterator();
		if(iterator.hasNext()){
			System.out.println(iterator.next());
			list.add(4);
		} if(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}

}
