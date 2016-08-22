package test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class RedMart{
	int array[][];
	
	int[][] input = {{50, 201, 129, 947, 185},
		  	{1038, 732, 394, 550, 425},
		  	{436, 1245, 1366, 445, 439},
		  	{1482, 460, 0, 1439, 546},
		  	{521, 141, 1003, 1113, 241}
		  };
	int length = 5;

	/*public static void main(String[] args) {
		String outPath  = "C:/Users/souvik.goswami/Desktop/RedMart.txt";
		String path = "C:/Users/souvik.goswami/Desktop/ROUGH2.txt";
		int xCoord = -1;
		int yCoord = -1;
		try(Scanner scanner = new Scanner(Paths.get(path));) {
			FileWriter writer = new FileWriter(outPath);
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int max = -1;
			for(int counterX = 0; counterX<x ; counterX++){
				for(int counterY = 0; counterY<y; counterY++){
					int next = scanner.nextInt();
					writer.write(String.format("%4d ", next));
					if(next>max){
						max = next;
						xCoord = counterX;
						yCoord = counterY;
					}
				}
				writer.write("\n");
			}
			writer.close();
			System.out.format("Found highest:%d, at X:%d, Y:%d\n", max, xCoord, yCoord);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/
	
	
	int getHighestSurrounding(int x, int y){
		int vResult, hResult, result;
		if(x == 0)	
			hResult = input[x+1][y];
		else if(x == length) 
			hResult = input[x-1][y];
		
		if(y == 0)	
			vResult = input[x][y+1];
		else if(x == length) 
			vResult = input[x][y-1];
		
		//if(hResult>current)return 1;
		//if 
		return result;
		
	}
	
	
	class MyPath implements Comparable<MyPath>{
		private int steps;
		private int difference;
		private List<Integer> xAxis;
		private List<Integer> yAxis;
		
		public MyPath(){
			xAxis = new LinkedList<>();
			yAxis = new LinkedList<>();
		}
		
		@Override
		public int compareTo(MyPath o) {
			return this.getDifference() - o.getDifference();
			
		}
		
		public int getDifference(){
			return input[xAxis.get(xAxis.size())][yAxis.get(xAxis.size())]- input[xAxis.get(0)][yAxis.get(0)];
		}
		
		public void addStep(int x,int y){
			xAxis.add(x); 
			yAxis.add(y);
		}
		
		//public 
	}

}