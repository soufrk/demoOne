package array;

import java.util.Arrays;

/**
 * Guess the output.
 * 
 * @author soufrk
 *
 */
public class ArrayCopySizeProblem {

    public static void main1(String[] args) {
	int []source = {1, 2, 3};
	int []destination = new int[4];
	destination = Arrays.copyOf(source, 3);
	destination[3] = 4;
	System.out.println(Arrays.toString(destination));
    }
    
    public static void main2(String[] args) {
	int []source = {1, 2, 3};
	int []destination = new int[4];
	destination = Arrays.copyOf(source, 4);
	System.out.println(Arrays.toString(destination));
	destination[3] = 4;
	System.out.println(Arrays.toString(destination));
    }
    
    public static void main(String[] args) {
	int []source = {1, 2, 3, 4};
	int []destination = new int[4];
	destination = Arrays.copyOfRange(source, 0, 2);
	destination[3] = 5;
	System.out.println(Arrays.toString(destination));
    }

}
