package test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DataReader {
	
	static int [][] array;
	static int length, breadth;
	
	static{
		array = null;
		length = -1;
		breadth = -1;
	}

	public static void main(String[] args) {
		//String outPath  = "C:/Users/souvik.goswami/Desktop/RedMart.txt";
		String path = "path/to/souvik.goswami/Desktop/ROUGH2.txt";
		int [][] array = new int[20][20];
		int length = 20;
		try(Scanner scanner = new Scanner(Paths.get(path));) {
			int max = -1;
			for(int counterX = 0; counterX<length ; counterX++){
				for(int counterY = 0; counterY<length; counterY++){
					int tmp = scanner.nextInt();
					//System.out.format("Scanned [%d] at[%d][%d]", tmp, counterX+1, counterY+1);
					array[counterX][counterY] = tmp;
				}
				//System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void readArray() {
		String path  = "C:/Users/souvik.goswami/Desktop/RedMart.txt";
		try(Scanner scanner = new Scanner(Paths.get(path));) {
			length = scanner.nextInt();
			breadth = scanner.nextInt();
			array = new int[length][breadth];
			int max = -1;
			for(int counterX = 0; counterX<length ; counterX++){
				for(int counterY = 0; counterY<breadth; counterY++){
					int tmp = scanner.nextInt();
					//System.out.format("Scanned [%d] at[%d][%d]", tmp, counterX+1, counterY+1);
					array[counterX][counterY] = tmp;
				}
				//System.out.println("");
			}			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NoSuchElementException e){
			System.err.println("Most likeley rows and columns of data didn't match with dimensions.");
		}
	}
	
	public static int getLength(){
		return length;
	}
	
	public static int getBreadth(){
		return breadth;
	}
	
	public static int[][] getArray(){
		return array;
	}

}
