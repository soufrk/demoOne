package exceptions;

import java.util.Scanner;

/**
 * So, any catch phrases here ?
 * 
 * @author soufrk
 *
 */
public class TryWithResourceSyntax {

    public static void main(String[] args) {
	try (Scanner a = new Scanner(System.in);
		System.out.println("Hello");
		Scanner b = new Scanner(System.in);) {
	}
    }

}
