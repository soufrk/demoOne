package test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * PPF Calculator class with formatted output.
 * @author soufrk
 *
 */
public class PpfCalculatorWithFormat {
	public static void main(String args[]) {
		double[] p = {100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00,  100.00, 100.00, 100.00, 100.00};
		String[] m = { "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar" };
		double[] i = { 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0 };
		Locale locale = new Locale("en", "IN");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		double a = 0.0, total = 0.0;
		for (int j = 0; j < 12; j++) {
			a += p[j];
			double interest = a * i[j] / 1200;
			total += interest;
			System.out.format("%3s --> Amount:%10s Interest:%10s\n", m[j], currencyFormatter.format(a), currencyFormatter.format(interest));
		}
		System.out.format(" Total Amount = %10s, Total Interest= %10s", currencyFormatter.format(a), currencyFormatter.format(total));
		System.out.format("\n Amount + Interest = %10s\n", currencyFormatter.format(a + total));
	}
}
