package test;

public class PPFCalculator {
	public static void main(String args[]) {
		double[] p = {100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00,  100.00, 100.00, 100.00, 100.00};
		String[] m = { "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar" };
		double[] i = { 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.0, 8.0, 8.0 };
		double a = 0.0, total = 0.0;
		for (int j = 0; j < 12; j++) {
			a += p[j];
			double interest = a * i[j] / 1200;
			total += interest;
			System.out.format("%3s --> Amount:%8.2f Interest:%8.2f\n", m[j], a, interest);
		}
		System.out.format(" Total Amount:%8.2f, Total Interest: %8.2f", a, total);
	}
}
