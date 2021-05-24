package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Elaborate use of flatMap
 * 
 * Collection of collection leads to Stream of Stream. FlatMap helps merge
 * Streams within a Stream, to main Staream.
 * 
 * @author soufrk
 *
 */
public class Streams011 {

    /**
     * Use-Case #1 List of Strings->Split into arrays
     * 
     * @param soufrk
     */
    public static void main1(String... args) {
	List<String> listOfStrings = new LinkedList<>();
	listOfStrings.add("A1, B1, C1, D1");
	listOfStrings.add("A2, B2, C2, D2");
	listOfStrings.add("A3, B3, C3, D3");
	listOfStrings.add("A4, B4, C4, D4");

//	listOfStrings.stream()
//	    .map(s->s.split(","))  //yields Array from each String 
//	    .forEach(System.out::println);

	Stream<String[]> streamOfTokens = listOfStrings
		.stream()
		.map(s -> s.split(",")); // Split String into array of
											 // Tokens
//		streamOfTokens.map(m->Arrays.stream(m)) // create Stream of arrays of tokens
//		.forEach(System.out::println); // Yields multiple Streams

	streamOfTokens.flatMap(m -> Arrays.stream(m)) // join multiple streams into one stream, and flatten contents
		.forEach(System.out::println); // Yields multiple Streams

	streamOfTokens.flatMap(m -> Arrays.stream(m)) // join multiple streams into one stream, and flatten contents
		.map(s -> s.trim()) // remove leading/trailing space
		.forEach(System.out::println); // Yields multiple Streams
    }

    /**
     * Use-Case #2 List of List
     */
    public static void main(String[] args) {
	Map<String, Double> marks = new HashMap<>();
	marks.put("MATHEMATICS", 77.00);
	marks.put("SCIENCE", 88.00);
	marks.put("LANGUAGE-1", 70.00);
	Student s1 = new Student(1L, "STUDENT-1", Collections.unmodifiableMap(marks));
	marks.put("MATHEMATICS", 85.00);
	marks.put("SCIENCE", 95.00);
	marks.put("LANGUAGE-1", 75.00);
	Student s2 = new Student(2L, "STUDENT-2", Collections.unmodifiableMap(marks));
	List<Student> listOfStudents = new LinkedList<>();
	listOfStudents.add(s1);
	listOfStudents.add(s2);

	Stream<Student> streamOfStudents = listOfStudents.stream();
	streamOfStudents.flatMap(m -> Stream.of(m.marks)).forEach(System.out::println);
    }

    private static class Student {
	Long id;
	String name;
	Map<String, Double> marks;

	public Student(Long id, String name, Map<String, Double> marks) {
	    this.id = id;
	    this.name = name;
	    this.marks = marks;
	}

	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public Map<String, Double> getMarks() {
	    return marks;
	}

	public void setMarks(Map<String, Double> marks) {
	    this.marks = marks;
	}

    }

}
