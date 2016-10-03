package test;

public class PPFCalculator {
	public static void main(String args[]) {
		double[] p = { 1,2,3,4,5,6,7,8,9,10,11,12 };
		String[] m = { "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar" };
		double[] i = { 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.1, 8.0, 8.0, 8.0 };
		double a = 0.0, total = 0.0;
		for (int j = 0; j < 12; j++) {
			a += p[j];
			double interest = a * i[j] / 1200;
			total += interest;
			System.out.println(m[j] + "-->" + interest);
		}
		System.out.println("Amount:" + a);
		System.out.println("Total:" + total);
	}
}
