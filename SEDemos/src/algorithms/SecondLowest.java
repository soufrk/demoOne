package algorithms;

/**
 * Like 2nd-highest, finding second lowest number in a collection in single
 * iteration.
 * 
 * @author soufrk
 *
 */
public class SecondLowest {

    public static void main(String[] args) {
	int input[] = { 0, 12, 8, 7, 15, 6, 4, 19, 3, 17, 9, 1, 20, 5, 10, 13, 2, 14 };
	int lowest, secondLowest;
	lowest = secondLowest = Integer.MAX_VALUE;

	for (int element : input) {
	    if (element < lowest) {
		// System.out.println("1. " + element + ">" + highest);
		secondLowest = lowest;
		lowest = element;
		// System.out.println("Highest=" + highest);
		// System.out.println("Second highest=" + secondHighest);
	    } else if (element < secondLowest) {
		// System.out.println("2. " + element + ">" + secondHighest);
		secondLowest = element;
		// System.out.println("Second highest=" + secondHighest);
	    }
	}
	System.out.println("Lowest:" + lowest);
	System.out.println("Second lowest:" + secondLowest);
    }

}
