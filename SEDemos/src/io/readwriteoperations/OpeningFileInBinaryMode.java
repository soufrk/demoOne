package io.readwriteoperations;

import java.io.FileInputStream;
import java.io.IOException;

public class OpeningFileInBinaryMode {

    public static void main(String[] args) {
	String[] inputFiles = {"README.md", "empty.txt", "blank.txt"};
	for(String p:inputFiles){
	    //printFileSize(p);
	    readFile(p);
	}
    }
    
    private static void printFileSize(String fileName){
	try(FileInputStream inputStream = new FileInputStream(fileName);) {
	    System.out.println("File Name:" + fileName);
	    System.out.println("File Size:" + inputStream.available());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    private static void readFile(String fileName){
	final int lineBreakSize = 40; 
	try(FileInputStream inputStream = new FileInputStream(fileName);) {
	    System.out.println("File Name:" + fileName);
	    System.out.println("File Size:" + inputStream.available());
	    System.out.println("Content:");
	    StringBuilder builder = new StringBuilder();
	    while(inputStream.available() > 0){
		builder.append(inputStream.read() + " ");
	    }
	    /*int linebreaks = builder.length()%lineBreakSize;
	    linebreaks = (builder.length() + linebreaks)%lineBreakSize;
	    int lineBreakCounter = 0;
	    while(lineBreakCounter<linebreaks){
		builder.insert(lineBreakCounter++*lineBreakSize, "\n");
	    }*/
	    System.out.println(builder.toString() + "\n");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
