package concurrency.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap Vs HashMap
 * Find the odd method out.
 * 
 * @author soufrk
 *
 */
public class ConcurrentVsHashMap {

	public static void main(String[] args) {
		// Given either of them,
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		HashMap<Integer, String> map = new HashMap<>();
		// Find the odd one out.
		map.put(1, "A");
		map.putIfAbsent(2, "B");
		map.remove(5);
		map.removeIfPresent(6);
	}

}
