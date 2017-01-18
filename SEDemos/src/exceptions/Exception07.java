package exceptions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * So, what sort of exception do you expect when cross bounds
 * with an array & a array-list.
 * 
 * What about LinkedList ?
 * @author souvik.goswami
 *
 */
public class Exception07 {

	public static void main(String[] args) {
		
		int[] myArr = new int[2];
		System.out.println(myArr[2]);
		
		List myListB = new ArrayList();
		System.out.println(myListB.get(0));
		
		List myListA = new LinkedList();
		System.out.println(myListA.get(0));
	}

}
