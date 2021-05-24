package streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * reduce() Map-Reduction
 * 
 * So, how will a Stream handle null value ? 
 * a. will the sum hold null value ?
 * b. will sum store Nullable Optional value 
 * c. will the cde throw NullPointerException ?
 * d. the code won't compile
 * 
 * @author soufrk
 *
 */
public class Streams003 {

    public static void main(String[] args) {
	List<Double> listOfValues = new LinkedList() {
	    {
		add(1.2);
		add(2.3);
		add(3.4);
		add(4.5);
		add(5.6);
		add(6.7);
		add(null);
	    }
	};
	Optional<Double> sum = listOfValues.stream()
		.reduce((v1, v2) -> {
		    return v1 + v2;
		});
	System.out.println(sum.get());
    }

}
