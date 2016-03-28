package exceptions;

import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates that array throws ArrayIndexOutOfBoundsException.
 * But not with ArrayList, which throws parent IndexOutOfBoundsException.
 * @author soufrk
 *
 */
public class Exception07 {

	public static void main(String[] args) {
		int[] myArr = new int[2];
		/* ArrayIndexOutOfBoundsException */ 
		//System.out.println(myArr[2]);
		
		List myList = new LinkedList();
		/* IndexOutOfBoundsException */
		System.out.println(myList.get(0));
	}

}
