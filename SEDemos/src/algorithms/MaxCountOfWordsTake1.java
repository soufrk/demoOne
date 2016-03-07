package algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Listing words with maximum occurrence in a given string - Second attempt.
 * @author soufrk
 *
 */
public class MaxCountOfWordsTake1 {

	public static void main(String[] args) {
		//String input = "a b a b a c d e d e f c";
		String input = "a b a b";
		List<WordCount1> listOfWordCounts = new LinkedList<>();
		MaxCountOfWordsTake1 instance = new MaxCountOfWordsTake1();
		String tempCopy = input;
		System.out.println("Input:" + input);
		/*for(String token:tokens){
			int foundIndex = 0;
			int count = -1;
			String tempCopy = input;
			do{
				//input = input.indexOf(token)==-1?input:input.substring(input.indexOf(token));
				foundIndex = tempCopy.indexOf(token);
				System.out.println("Found at:" + foundIndex);
				tempCopy = tempCopy.substring(tempCopy.indexOf(token) + 1);
				System.out.println("Sub-string:" + tempCopy);
				count++;
			}while(foundIndex != -1);
			System.out.println(token + "," + count);
			listOfWordCounts.add(instance.new WordCount2(token, count));
		}*/
		
		/*for(String token:tokens){
			Pattern pattern = Pattern.compile(token);
			String tempCopy = input;
			Matcher matcher = pattern.matcher(tempCopy);
			System.out.println("Result for - " + token);
			while (matcher.find()) {
				//System.out.println(matcher.start() + "(" + matcher.group() + ")" + matcher.end());
				System.out.println("1st Part:" + tempCopy.substring(0, matcher.start()+1));
				System.out.println("2nd Part:" + tempCopy.substring(matcher.end()));
			}
			//System.out.println(token + "," + count);
			//listOfWordCounts.add(instance.new WordCount2(token, count));
		}*/
		
		do{
			Scanner scanner = new Scanner(tempCopy);
			String firstToken = scanner.next();
			Pattern pattern = Pattern.compile(firstToken);
			Matcher matcher = pattern.matcher(tempCopy);
			while (matcher.find()) {
				//matcher
				//System.out.println(matcher.start() + "(" + matcher.group() + ")" + matcher.end());
				//System.out.println("1st Part:" + tempCopy.substring(0, matcher.start()+1));
				System.out.println("2nd Part:" + tempCopy.substring(matcher.end()+1));
			}
		}while(tempCopy.length() == 0);
		
		Collections.sort(listOfWordCounts);
		System.out.println(listOfWordCounts);
		
		/*System.out.println(input.indexOf("a")==-1?"not found":"found");
		System.out.println(input.indexOf("z")==-1?"not found":"found");*/
		/*System.out.println(input.indexOf("a"));
		System.out.println(input.substring(0));*/

	}

	class WordCount1 implements Comparable<WordCount1>{
		
		private String word;
		private int count;
		private int compareCounter;
		
		public WordCount1(){compareCounter = 0;}

		public WordCount1(String word, int count) {
			super();
			compareCounter = 0;
			this.word = word;
			this.count = count;
		}
		
		public String getWord() {
			return word;
		}

		public int getCount() {
			return count;
		}

		@Override
		public int compareTo(WordCount1 o) {
			//System.out.println("compareTo invoked:" + compareCounter ++);
			//return this.count - o.count;
			return o.getCount() - this.count;
		}

		@Override
		public String toString() {
			return "WordCount [word=" + word + ", count=" + count + "]\n";
		}
		
	}
}
