package formatter;

/**
 * Demonstration of formatting decimal numbers with precision & rounding.
 * 
 * @author soufrk
 *
 */
public class RealNumbersAndPrecision {

    public static void main(String[] args) {
	System.out.format("%.1f \n", 123.456);
	System.out.format("%4.1f \n", 123.456);

	System.out.format("%4.1f \n", 1234.567);
	System.out.format("%5.1f \n", 1234.567);

	System.out.format("%4.1f %3.1f\n", 1234.567, 123.456);
	System.out.format("%6.1f %6.1f\n", 1234.567, 123.456);
    }

}
