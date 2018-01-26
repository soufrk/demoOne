package threads;

/**
 * What's the harm in joining a Thread which hasn't yet been started.
 * 
 * @author soufrk
 *
 */
public class JoiningThread {

    public static void main(String[] args) {
	Thread t = new Thread(new Runnable() {
	    @Override
	    public void run() {
		System.out.println("This is a separate thread.");
	    }
	});
	// t.start();
	//t.join();
    }

}
