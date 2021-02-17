package streams;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Streams004 {

    /**
     * Build a Stream pipeline that computes the sum of elements
     * and finds the maximum.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Double> listOfValues = new LinkedList(){{
            add(1.2);
            add(2.3);
            add(3.4);
            add(4.5);
            add(5.6);
            add(6.7);
        }};
        findHighLow(listOfValues);
        findHighLow(Collections.singletonList(2.0));
        findHighLow(null);
    }

    private static void findHighLow(List<Double> listOfValues) {
        Optional<Double> highest = listOfValues.stream()
                .reduce((v1, v2)->{
                    return v1>v2?v1:v2;
                });
        System.out.println(highest.get());

        Optional<Double> lowest = listOfValues.stream()
                .reduce((v1, v2)->{
                    return v1>v2?v2:v1;
                });
        System.out.println(lowest.get());
    }

}
