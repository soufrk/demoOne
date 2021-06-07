package streams.parallelstreams;

import java.util.Arrays;

public class ParallelStream01 {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 2, 9, 10};
        // Normal Stream operation
        int sum1 = Arrays.stream(numbers).sum();
        System.out.println("Sum=" + sum1);

        // Parallel Stream operation
        int sum2 = Arrays.stream(numbers).parallel().sum();
        System.out.println("Sum=" + sum2);
    }

}
