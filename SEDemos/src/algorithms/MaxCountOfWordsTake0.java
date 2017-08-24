package algorithms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Listing words with maximum occurrence in a given string - First attempt.
 * 
 * @author soufrk
 *
 */
public class MaxCountOfWordsTake0 {

    public static void main(String[] args) {
	String x = "a b a b a c d e d e f c";
	Map<String, Integer> mapOfWords = new HashMap<>();
	List<WordCount> sortedCountMap = new LinkedList<>();
	String[] tokens = x.split(" ");
	for (String token : tokens) {
	    if (mapOfWords.containsKey(token)) {
		int count = mapOfWords.get(token);
		mapOfWords.put(token, ++count);
	    } else {
		mapOfWords.put(token, 1);
	    }
	}
	System.out.println(mapOfWords.toString());
	MaxCountOfWordsTake0 outerClass = new MaxCountOfWordsTake0();
	for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
	    WordCount wordCount = outerClass.new WordCount(entry.getKey(), entry.getValue());
	    sortedCountMap.add(wordCount);
	}
	System.out.println(sortedCountMap);
	Collections.sort(sortedCountMap);
	System.out.println(sortedCountMap);
	// int counter = 0;
	/*
	 * for(Map.Entry<WordCount, Integer> entry:sortedCountMap.entrySet()){
	 * System.out.println(entry.getKey().getWord() + ":" +
	 * entry.getValue()); if(counter++ > 2) break; }
	 */
    }

    class WordCount implements Comparable<WordCount> {

	private String word;
	private int count;
	private int compareCounter;

	WordCount() {
	    compareCounter = 0;
	}

	WordCount(String word, int count) {
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
	public int compareTo(WordCount o) {
	    System.out.println("compareTo invoked:" + compareCounter++);
	    // return this.count - o.count;
	    return o.count - this.count;
	}

	@Override
	public String toString() {
	    return "WordCount [word=" + word + ", count=" + count + "]";
	}

    }
}
