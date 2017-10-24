package io;

import java.util.Scanner;

/**
 * Scanner and nextXXX() does not advance past an unmatched token.
 * 
 * @author soufrk
 *
 */
public class UsingScannerNextXXX {

    public static void main(String[] args) {
	String input = "a 1 2 a 3 45 6";
	Scanner sc = new Scanner(input);
	int x = 0;

	//do {
	//    x = sc.nextInt();
	//    System.out.println(x + " ");
	//} while (x != 0);

	//if(sc.hasNextInt()){
	//    System.out.println(sc.nextInt());
	//}
	
	while (sc.hasNext()) {
	    System.out.println(sc.nextInt());
	}

    }

}
