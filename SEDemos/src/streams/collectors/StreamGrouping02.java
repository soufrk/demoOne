package streams.collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Counting and Joining using Collector.
 */
public class StreamGrouping02 {

//	public static void main1(String[] args) {
//		List l = Arrays.asList(1, 3, 5, 7, 18, 12, 20, 4, 16);
//		// 1. Count elements in the stream
//		long count1 = l.stream().count();
//		System.out.println("Count of elements=" + count1);
//		// 2. Count using Collectors
//		Long count2 = (Long) l.stream().collect(Collectors.counting());
//		System.out.println("Count of elements=" + count2);
//		// 3. Joining elements
//		System.out.println("Joining:" + l.stream().map(m->"" + m).collect(Collectors.joining(",")));
//		// 4. Finding maximum value
//		System.out.println("Maximum:" + l.stream().collect(Collectors.maxBy((v1,v2)->v1-v2)));
//	}

    public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1, 3, 5, 7, 18, 12, 20, 4, 16);
	// List<Integer> l = Collections.singletonList(1); // What happens with single
	// element
	// List<Integer> l = null; // What happens if null is passed
	// 1. Count elements in the stream
	long count1 = l.stream().count();
	System.out.println("Count of elements=" + count1);
	// 2. Count using Collectors
	Long count2 = (Long) l.stream().collect(Collectors.counting());
	System.out.println("Count of elements=" + count2);
	// 3. Joining elements
	System.out.println("Joining:" + l.stream().map(m -> "" + m).collect(Collectors.joining(",")));
	// 4. Finding maximum value
	System.out.println("Maximum:" + l.stream().collect(Collectors.maxBy((v1, v2) -> v1 - v2)));
	// 5. Finding minimum value
	System.out.println("Minimum:" + l.stream().collect(Collectors.minBy((v1, v2) -> v1 - v2)));
    }

}
