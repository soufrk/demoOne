package multithread;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class MultiThread03 implements Runnable {

	private String path;
	private static int COUNTER, MAX_COUNT;
	// private static List<String> FILE_PATHS;

	static {
		COUNTER = 0;
		MAX_COUNT = 0;
		// FILE_PATHS = new LinkedList<>();
	}

	public MultiThread03(String path) {
		this.path = path;
	}

	/*
	 * (non-Javadoc) Why to keep reading of file names inside synchronized block. Reading files under a directory can be independent of each other.
	 * Let's just ask to join on threads it spawns.
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			MultiThread03.incrementCounter();
			File filePath = new File(path);
			File[] listOfFiles = filePath.listFiles();
			for (File temp : listOfFiles) {
				String output = "";
				if (temp.isFile()) {
					output = String.format("\n%-10s prints path - %20s", Thread.currentThread().getName(),
							temp.getAbsolutePath());
					// FILE_PATHS.add(output);
					output += "\nmax count=" + MAX_COUNT;

				} else if (temp.isDirectory()) {
					Thread t = new Thread(new MultiThread03(temp.getPath()));
					output += String.format("\n\t\t\t\t%-10s spawns new thread - %10s, with path - %50s",
							Thread.currentThread().getName(), t.getName(), temp.getPath());
					t.start();
					t.join();
					// But the problem is, the thread execution output appears first, and then creation.
				}
				synchronized (System.out) {
					System.out.print(output);
				}
			}

			MultiThread03.decrementCounter();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void incrementCounter() {
		System.out.format("\n\t\t%-10s INCREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER++;
		MAX_COUNT++;
		// if(COUNTER > MAX_COUNT)
		// MAX_COUNT = COUNTER;
	}

	private static void decrementCounter() {
		System.out.format("\n\t\t%-10s DECREMENTS COUNTER AT - %02d", Thread.currentThread().getName(), COUNTER);
		COUNTER--;
	}

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/souvik.goswami/git/demoOne/SEDemos";
		PrintStream out = new PrintStream("output3.txt");
		System.setOut(out);
		Thread t = new Thread(new MultiThread03(path));
		t.start();
		while (t.isAlive()) {
		}
		System.out.println("\nCount=" + COUNTER + " Main Thread Exits.");
	}

}
