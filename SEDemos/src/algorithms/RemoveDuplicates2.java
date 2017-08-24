package algorithms;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
	int[] input = { 1, 1, 2, 1, 3, 2, 1, 3, 2, 1, 4, 2, 1, 3, 4, 1, 2, 3 };

	System.out.println();
	display(removeDuplicates(input));

    }

    public static int[] removeDuplicates(int[] input) {
	int[] output = new int[0];
	for (int t : input) {
	    if (!inArray(t, output)) {
		// output = Arrays.copyOf(output, output.length + 1);
		output = makeCopyOf(output, output.length + 1);
		output[output.length - 1] = t;
	    }
	}
	return output;
    }

    private static boolean inArray(int search, int[] array) {
	for (int element : array) {
	    if (element == search) {
		return true;
	    }
	}
	return false;
    }

    private static int[] makeCopyOf(int[] input, int length) {
	int[] output = new int[length];
	int indexCounter = 0;
	for (int element : input) {
	    output[indexCounter++] = element;
	}
	return output;
    }

    private static void display(int[] array) {
	StringBuilder builder = new StringBuilder();
	builder.append("[");
	for (int t : array) {
	    builder.append(t + ", ");
	}
	/*
	 * builder.deleteCharAt(builder.length()-1);
	 * builder.deleteCharAt(builder.length()-1);
	 */

	builder.append("]");
	System.out.println(builder.toString());
    }

}
