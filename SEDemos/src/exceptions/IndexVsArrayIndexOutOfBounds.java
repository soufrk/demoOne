package exceptions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * So, what sort of exception do you expect when cross bounds with an array & a
 * array-list.
 * 
 * What about LinkedList ?
 * 
 * @author soufrk
 *
 */
public class IndexVsArrayIndexOutOfBounds {

	public static void main1(String[] args) {
		int[] myArr = new int[2];
		System.out.println(myArr[2]);
	}

	public static void main2(String[] args) {
		List myListA = new ArrayList();
		System.out.println(myListA.get(0));
	}

	public static void main3(String[] args) {
		List myListA = new LinkedList();
		System.out.println(myListA.get(0));
	}

}
