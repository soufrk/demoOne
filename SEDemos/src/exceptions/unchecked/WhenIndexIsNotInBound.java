package exceptions.unchecked;

/**
 * Something is definitely wrong with the code below.
 * 
 * @author soufrk
 *
 */
public class WhenIndexIsNotInBound {

    public static void main(String[] args) {
	int[] arr = { 1, 2, 3 };
	checkIndex(arr, -1);
	checkIndex(arr, 2);
	checkIndex(arr, 3);
    }

    private static void checkIndex(int[] arr, int index) {
	if (index < 0)
	    throw new IndexOutOfBoundException("Index cannot be negative");
	if (index > arr.length)
	    throw new IndexOutOfBoundException("Index beyond length");
    }

}
