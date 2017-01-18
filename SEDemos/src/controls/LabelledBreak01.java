package controls;

/**
 * Basic example of labelled break statement.
 * @author soufrk
 *
 */
public class LabelledBreak01 {

	public static void main(String[] args) {
		first: if (true) {
			System.out.println("A");
			break first;
		}

	}

	public static void main(String[] args) {
		first: for (int i = 0; i < 3; i++) {
			System.out.println(i);
			if (i == 2)
				break first;
		}
	}

	public static void main(String[] args) {
		first: 
			for (int i = 0; i < 3; i++)
			second: 
				for (int j = 0; j < 3; j++) {
				System.out.format("i=%d, j=%d\n", i, j);
				if (j == 2)
					break second;
			}
	}

}
