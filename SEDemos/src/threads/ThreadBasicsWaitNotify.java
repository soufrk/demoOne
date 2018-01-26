package threads;

/**
 * Think you can make a thread wait out of nowhere ?? Think again !!
 * 
 * @author soufrk
 *
 */
public class ThreadBasicsWaitNotify extends Thread {

    public static void main(String[] args) throws InterruptedException {
	ThreadBasicsWaitNotify t = new ThreadBasicsWaitNotify();
	t.start();
	t.wait();
    }

    @Override
    public void run() {
	System.out.println("Executing Run");
    }

}
