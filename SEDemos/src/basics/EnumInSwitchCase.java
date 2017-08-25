package basics;

/**
 * Demonstrates use of enums as constant values in if-else and switch-case
 * statements.
 * 
 * @author soufrk
 *
 */
public class EnumInSwitchCase {

    public static void main(String[] args) {
	Status status = Status.THIRD;
	if (status == Status.THIRD)
	    System.out.println("" + true);
	if (status.getValue() == 3)
	    System.out.println("" + true);

	switch (status) {
	case FOURTH:
	case THIRD:
	}
	System.out.println(Status.FIRST);
    }

}

enum Status {
    FIRST(0), SECOND(1), THIRD(2), FOURTH(3), FIFTH(4), SIXTH(5);

    private final int value;

    private Status(final int newValue) {
	value = newValue;
    }

    public int getValue() {
	return value;
    }

    /**
     * And like a class <tt>toString()</tt> method can also be overridden.
     */
    @Override
    public String toString() {
	return "" + value;
    }

}