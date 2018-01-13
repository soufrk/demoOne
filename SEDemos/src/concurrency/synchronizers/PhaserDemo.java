package concurrency;

import java.util.Scanner;
import java.util.concurrent.Phaser;

/**
 * A simple demonstration of using Phaser.
 * 
 * Use-case: The main thread asks user to prompt whether to count more,
 * and signals the counting thread. Upon receiving signal it counts ahead
 * and waits for main thread to tell whether to count more. 
 * 
 * @author soufrk
 *
 */
public class PhaserDemo extends Thread {
    
    private static Phaser PHASER = new Phaser(2);
    private static boolean COUNT_MORE = true;
    private int counter;

    public static void main(String[] args) {
	//Thread[] threads = {new PhaserDemo(), new PhaserDemo(), new PhaserDemo()};
	new PhaserDemo().start();
	String input = "";
	do{
	    System.out.println("Count more ?(Y/N)");
	    Scanner scanner = new Scanner(System.in);
	    input = scanner.next();
	    if(input.equals("N")){
		PHASER.arriveAndDeregister();
		COUNT_MORE = false;
	    }
	    PHASER.arriveAndAwaitAdvance();
	}while(COUNT_MORE);
    }
    
    @Override
    public void run() {
	do{
	    PHASER.arriveAndAwaitAdvance();
	    counter++;
	    System.out.println(this.getName() + " counts at:" + counter);
	    try{
		sleep(1000);
	    }catch(InterruptedException e){
		e.printStackTrace();
	    }
	}while(COUNT_MORE);
	PHASER.arriveAndDeregister();
    }

}
