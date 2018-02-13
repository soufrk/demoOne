package test;

import java.util.Arrays;

/**
 * Guess the output.
 * 
 * @author soufrk
 *
 */
public class ArrayCopySizeProblem {

    public static void main(String[] args) {
	int []source = {1, 2, 3};
	int []destination = new int[4];
	destination = Arrays.copyOf(source, 3);
	destination[3] = 4;
	System.out.println(destination.length);
    }

}
