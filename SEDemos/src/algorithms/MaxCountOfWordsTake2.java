package algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Obtain count of all unique words in a string, and sort with ascending or
 * descending order of number of count.
 * 
 * @author soufrk
 *
 */
public class MaxCountOfWordsTake2 {

    public static void main(String[] args) {
	// String x = "a b t a b a c d t e d e f c t";
	String x = "ab cd ef ab ef cd ab mn ab op ef ab st uv cd mn rs wx ef mn pq rs uv mn ab cd op"
		+ " mn cd ef ab ef cd pq mn ab op ef ab st pq cd mn rs ab ef mn pq rs cd mn ab cd op"
		+ " bc ef ab ef cd ab mn ef ab st uv ef cd mn rs wx ef mn pq ab st uv mn ab cd op op";

	Map<String, WordCount> mapOfWords = new HashMap<>();
	List<WordCount> sortedCountMap = new LinkedList<>();
	String[] tokens = x.split(" ");
	MaxCountOfWordsTake2 tempObject = new MaxCountOfWordsTake2();
	int counter = 0;
	for (String token : tokens) {
	    if (mapOfWords.containsKey(token)) {
		WordCount countObject = mapOfWords.get(token);
		countObject.addIndex(counter);
	    } else {
		WordCount countObject = tempObject.new WordCount(token);
		mapOfWords.put(token, countObject);
	    }
	}
	// System.out.println(mapOfWords.toString());
	List<WordCount> sortedListOfWordCounts = new LinkedList(mapOfWords.values());

	// Collections.sort(sortedListOfWordCounts, tempObject.new
	// WordCountAscendingComparator());
	// for(WordCount temp:sortedListOfWordCounts){
	// System.out.println(temp.word + ":" + temp.count);
	// }
	//
	// Collections.sort(sortedListOfWordCounts, tempObject.new
	// WordCountDescendingComparator());
	// for(WordCount temp:sortedListOfWordCounts){
	// System.out.println(temp.word + ":" + temp.count);
	// }
	//
	// Collections.sort(sortedListOfWordCounts, tempObject.new
	// WordCountDictionaryComparator());
	// for(WordCount temp:sortedListOfWordCounts){
	// System.out.println(temp.word + ":" + temp.count);
	// }

	Collections.sort(sortedListOfWordCounts, tempObject.new TestComparator());
	for (WordCount temp : sortedListOfWordCounts) {
	    System.out.println(temp.word + ":" + temp.count);
	}
    }

    class WordCount {

	private String word;
	private int count;
	private final List<Integer> indices;

	WordCount() {
	    indices = new LinkedList<>();
	}

	WordCount(String word) {
	    super();
	    this.word = word;
	    this.count = 1;
	    this.indices = new LinkedList<>();
	}

	public String getWord() {
	    return word;
	}

	public int getCount() {
	    return count;
	}

	public void addIndex(int index) {
	    indices.add(new Integer(index));
	    count++;
	}

	@Override
	public String toString() {
	    return "WordCount [word=" + word + ", count=" + count + "]";
	}

    }

    class TestComparator implements Comparator<WordCount> {
	@Override
	public int compare(WordCount o1, WordCount o2) {
	    // System.out.println(o1.getWord() + " compared with " +
	    // o2.getWord());
	    return o1.count - o2.count;
	}
    }

    class WordCountAscendingComparator implements Comparator<WordCount> {
	@Override
	public int compare(WordCount o1, WordCount o2) {
	    return o1.count - o2.count;
	}
    }

    class WordCountDescendingComparator implements Comparator<WordCount> {
	@Override
	public int compare(WordCount o1, WordCount o2) {
	    return o2.count - o1.count;
	}
    }

    class WordCountDictionaryComparator implements Comparator<WordCount> {
	@Override
	public int compare(WordCount o1, WordCount o2) {
	    if (o2.count == o1.count) {
		// return o2.word.compareTo(o1.word);
		return o1.word.compareTo(o2.word);
	    } else {
		return o2.count - o1.count;
	    }
	}
    }
}