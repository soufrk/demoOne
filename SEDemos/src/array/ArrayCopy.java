package array;

/**
 * System array copy.
 * 
 * @author soufrk
 *
 */
public class ArrayCopy {

    public static void main(String[] args) {
	int arr1[] = { 0, 1, 2, 3, 4, 5 };
	int arr2[] = { 0, 10, 20, 30, 40, 50 };

	// copies an array from the specified source array
	System.arraycopy(arr1, 0, arr2, 0, 1);
	System.out.println("Array 1");
	for (int x : arr1) {
	    System.out.print(x + " ");
	}
	System.out.println("\nArray 2");
	for (int x : arr2) {
	    System.out.print(x + " ");
	}
    }

}
