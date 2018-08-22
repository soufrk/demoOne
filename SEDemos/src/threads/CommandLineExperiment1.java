package threads;

import java.io.Console;

/**
 * Guess the outcome/output.
 * 
 * @author soufrk
 *
 */
public class CommandLineExperiment1 implements Runnable {

    private static int i;

    public static void main(String[] args) {
	Console c = System.console();
	String n = "";
	Thread t = new Thread(new CommandLineExperiment1());
	do {
	    System.out.println("1. Read value");
	    System.out.println("2. Write value");
	    System.out.println("Exit(e|E)");
	    n = c.readLine();
	    if (n.equalsIgnoreCase("e"))
		break;
	    try {
		i = Integer.parseInt(n);
		switch (i) {
		case 1:
		    t.start();
		    System.out.println("i=" + i);
		    System.out.println("i++=" + i++);
		    break;
		case 2:
		    System.out.println("Enter value:");
		    i = Integer.parseInt(c.readLine());
		    break;
		default:
		    System.out.println("Invalid input");
		    break;
		}
	    } catch (NumberFormatException e) {
		System.out.println("Invalid input");
	    }
	} while (!n.equalsIgnoreCase("e"));
    }

    @Override
    public void run() {
	int counter = 50000;
	while (counter-- > 0) {
	    i++;
	}
    }

}
