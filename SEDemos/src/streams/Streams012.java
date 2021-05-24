package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Generating Streams (infinite & finite)
 * 
 * @author soufrk
 *
 */
public class Streams012 {

    public static void main1(String... args) {
	Stream.iterate(0, n -> n + 1) // Generates infinite stream of number
		.limit(4) // Better limit it !!
		.forEach(System.out::println);
    }

    public static void main2(String... args) {
	Stream.iterate(1, n -> n + 1) // Generates infinite stream of number
		.peek(System.out::println) // Print generated elements
		.filter(n -> n % 11 == 0) // Filter condition, multiple of 11
		.findAny()// .findFirst() // Short-circuit operation
		.ifPresent(n -> System.out.println("Found=" + n));
    }

    public static void main3(String... args) {
	IntStream
		// .range(1, 10) // last element exclusive
		.rangeClosed(1, 10) // last element inclusive
		.forEach(System.out::println);
    }

    /**
     * Custom generator. Will the code terminate ?
     * 
     * @param args
     */
    public static void main(String[] args) {
	Generator g = new Generator();
	Stream<Long> timestamps = Stream.generate(() -> g.next());
	timestamps.filter(t -> t == System.currentTimeMillis()).findFirst()
		.ifPresent(n -> System.out.println("Found=" + n));
    }

    private static class Generator {
	long time = System.currentTimeMillis();

	public Long next() {
	    return time + 1000;
	}
    }

}
