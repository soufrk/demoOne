/**
 * Shouldn't the Thread t wait for 5 secs,
 * or the code just blows.
 * @author soufrk
 *
 */
public class TheSleepingThread {

	public static void main(String[] args) {
		Thread t = new Thread();
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
