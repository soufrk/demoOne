package collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates that equals method in List cares about order of elements;
 * size/number of elements being implicit.
 * 
 * @author soufrk
 *
 */
public class ListEquals {

    public static void main1(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	System.out.println(listA.equals(listB));
	System.out.println(listA == listB);
	
	listA.add("A");
	System.out.println("After adding item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("A");
	System.out.println("After adding item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding item in listB listA.equals(listB):" + listA.equals(listB));
    }
    
    public static void main2(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	System.out.println(listA.equals(listB));
	System.out.println(listA == listB);
	
	listA.add("A");
	System.out.println("After adding 1st item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("A");
	System.out.println("After adding 1st item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listB listA.equals(listB):" + listA.equals(listB));
	
	listA.add("B");
	System.out.println("After adding 2nd item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("B");
	System.out.println("After adding 2nd item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listB listA.equals(listB):" + listA.equals(listB));
    }
    
    public static void main3(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	System.out.println(listA.equals(listB));
	System.out.println(listA == listB);
	
	listA.add("A");
	System.out.println("After adding 1st item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("B");
	System.out.println("After adding 1st item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listB listA.equals(listB):" + listA.equals(listB));
	
	listA.add("B");
	System.out.println("After adding 2nd item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("A");
	System.out.println("After adding 2nd item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listB listA.equals(listB):" + listA.equals(listB));
    }
    
    public static void main(String[] args) {
	List<String> listA = new LinkedList<>();
	List<String> listB = new LinkedList<>();
	System.out.println(listA.equals(listB));
	System.out.println(listA == listB);
	
	listA.add("A");
	System.out.println("After adding 1st item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("A");
	System.out.println("After adding 1st item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 1st item in listB listA.equals(listB):" + listA.equals(listB));
	
	listA.add("B");
	System.out.println("After adding 2nd item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("B");
	System.out.println("After adding 2nd item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 2nd item in listB listA.equals(listB):" + listA.equals(listB));
	
	listA.add("A");
	System.out.println("After adding 3rd item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 3rd item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("A");
	System.out.println("After adding 3rd item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 3rd item in listB listA.equals(listB):" + listA.equals(listB));
	
	listA.add("B");
	System.out.println("After adding 4th item in listA listA == listB:" + (listA == listB));
	System.out.println("After adding 4th item in listA listA.equals(listB):" + listA.equals(listB));
	listB.add("B");
	System.out.println("After adding 4th item in listB listA == listB:" + (listA == listB));
	System.out.println("After adding 4th item in listB listA.equals(listB):" + listA.equals(listB));
    }

}
