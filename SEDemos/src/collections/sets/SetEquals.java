package collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrates that equals method in Set cares about exact elements;
 * no duplicate elements being implicit.
 * 
 * @author soufrk
 *
 */
public class SetEquals {

    public static void main1(String[] args) {
	Set<String> setA = new HashSet<>();
	Set<String> setB = new HashSet<>();
	System.out.println(setA.equals(setB));
	System.out.println(setA == setB);
	
	setA.add("A");
	System.out.println("After adding item in setA setA == setB:" + (setA == setB));
	System.out.println("After adding item in setA setA.equals(setB):" + setA.equals(setB));
	setB.add("A");
	System.out.println("After adding item in setB setA == setB:" + (setA == setB));
	System.out.println("After adding item in setB setA.equals(setB):" + setA.equals(setB));
    }
    
    public static void main2(String[] args) {
	Set<String> setA = new HashSet<>();
	Set<String> setB = new HashSet<>();
	System.out.println(setA.equals(setB));
	System.out.println(setA == setB);
	
	setA.add("A");
	System.out.println("After adding item in setA setA == setB:" + (setA == setB));
	System.out.println("After adding item in setA setA.equals(setB):" + setA.equals(setB));
	setB.add("A");
	System.out.println("After adding item in setB setA == setB:" + (setA == setB));
	System.out.println("After adding item in setB setA.equals(setB):" + setA.equals(setB));
	setA.add("B");
	System.out.println("After adding item in setA setA == setB:" + (setA == setB));
	System.out.println("After adding item in setA setA.equals(setB):" + setA.equals(setB));
	setB.add("B");
	System.out.println("After adding item in setB setA == setB:" + (setA == setB));
	System.out.println("After adding item in setB setA.equals(setB):" + setA.equals(setB));
    }
    
    /**
     * Order doesn't matter
     */
    public static void main(String[] args) {
	Set<String> setA = new HashSet<>();
	Set<String> setB = new HashSet<>();
	System.out.println(setA.equals(setB));
	System.out.println(setA == setB);
	
	setA.add("A");
	System.out.println("After adding item in setA setA == setB:" + (setA == setB));
	System.out.println("After adding item in setA setA.equals(setB):" + setA.equals(setB));
	setB.add("B");
	System.out.println("After adding item in setB setA == setB:" + (setA == setB));
	System.out.println("After adding item in setB setA.equals(setB):" + setA.equals(setB));
	setA.add("B");
	System.out.println("After adding item in setA setA == setB:" + (setA == setB));
	System.out.println("After adding item in setA setA.equals(setB):" + setA.equals(setB));
	setB.add("A");
	System.out.println("After adding item in setB setA == setB:" + (setA == setB));
	System.out.println("After adding item in setB setA.equals(setB):" + setA.equals(setB));
    }

}
