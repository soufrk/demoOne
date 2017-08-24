package algorithms;

/**
 * Finding second highest number in a collection in single iteration.
 * 
 * @author soufrk
 *
 */
public class SecondHighest {

    public static void main(String[] args) {
	int input[] = { 0, 12, 8, 7, 15, 6, 4, 19, 3, 17, 9, 1, 20, 5, 10, 13, 2, 14 };
	int highest, secondHighest;
	highest = secondHighest = Integer.MIN_VALUE;

	for (int element : input) {
	    if (element > highest) {
		// System.out.println("1. " + element + ">" + highest);
		secondHighest = highest;
		highest = element;
		// System.out.println("Highest=" + highest);
		// System.out.println("Second highest=" + secondHighest);
	    } else if (element > secondHighest) {
		// System.out.println("2. " + element + ">" + secondHighest);
		secondHighest = element;
		// System.out.println("Second highest=" + secondHighest);
	    }
	}
	System.out.println("Highest:" + highest);
	System.out.println("Second highest:" + secondHighest);
    }

}
