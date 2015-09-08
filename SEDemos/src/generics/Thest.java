package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Thest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String number = "" + x;
		int length = (number.length());
		// System.out.println(length);
		List<Integer> digits = new LinkedList<>();
		int counter = 0;
		int numberOfOdds = 0;
		String result = "";
		if (x == 0 || x == 8) {
			System.out.println("YES");
			System.exit(0);
		}
		while (counter < length) {
			int digit = Integer.parseInt("" + number.charAt(counter));
			if (digit % 2 == 1)
				numberOfOdds++;
			digits.add(digit);
			counter++;
		}
		if (numberOfOdds == counter) {
			// result = "NO";
			System.out.println("NO");
			System.exit(0);
		}
		if (counter == 2) {
			if (digits.contains(0) || digits.contains(8)) {
				// digits.remove()
			}
		}
		// System.out.println(numberOfOdds + " " + counter);

		/*
		 * for(int permutation = 0; permutation<permutations; permutation++){
		 * 
		 * }
		 */
		// System.out.println(numberOfOdds + " " + counter);

		// return result;

	}

}
