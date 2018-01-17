package collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Behaviour of removeAll method in a set.
 * @author soufrk
 *
 */
public class SetRemoveAll {

    public static void main1(String[] args) {
	Set<String> setA = new HashSet<>();
	Set<String> setB = new HashSet<>();
	
	setA.add("A");setA.add("B");setA.add("C");setA.add("C");
	setB.add("A");
	
	setA.removeAll(setB);
	System.out.println(setA);
    }
    
    public static void main(String[] args) {
	Set<String> setA = new HashSet<>();
	Set<String> setB = new HashSet<>();
	
	setA.add("A");setA.add("B");setA.add("C");setA.add("C");
	setB.add("A");setB.add("D");
	
	setA.removeAll(setB);
	System.out.println(setA);
    }

}
