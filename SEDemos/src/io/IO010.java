package io;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

import threads.Test001;

/**
 * Recursive Directory listing using queue.
 * @author souvik.goswami
 *
 */
public class IO010 extends Thread{

	private static Queue<String> queueOfDir = new LinkedList<>();
	
	public static void main(String[] args) {
		

	}
	
	@Override
	public void run() {
		String path = queueOfDir.peek();
		if(path != null){
			File[] arr = new File(path).listFiles();
	        for (File temp:arr) {
	            if(temp.isDirectory()){
	            	//new Thread(new NIO001(arr[i].getName())).start();
	            	//listOfDirs.add(new Thread(new Test001(arr[i].getName())));
	            	//queueOfDir.add(temp.)
	            	//System.out.println(arr[i].getName());
	            }else{
	            	//System.out.println(arr[i].getName());
	            }
	        }
		}
	}
}
