package array;

import java.util.Arrays;

public class PassingArrayAsParameter {

    public static void main(String[] args) {
	int[] input = {1};
	setWithoutReturn(input);
	System.out.println(Arrays.toString(input));
	int[] output = setAndReturn(input);
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(output));
	assignWithoutReturn(input);
	System.out.println(Arrays.toString(input));
	int[] output2 = assignWithReturn(input);
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(output2));
    }

    private static void setWithoutReturn(int[] input) {
	input[0] = 2;
    }
    
    private static void setWithoutReturn(int input) {
	input = 2;
    }
    
    private static int[] setAndReturn(int[] input) {
	input[0] = 3;
	return input;
    }
    
    private static int setAndReturn(int input) {
	input = 3;
	return input;
    }

    private static void assignWithoutReturn(int[] input) {
	int[] temp = {5}; 
	input = temp;
    }
    
    private static int[] assignWithReturn(int[] input) {
	int[] temp = {6}; 
	input = temp;
	return input;
    }
}
