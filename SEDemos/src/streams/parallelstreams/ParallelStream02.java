package streams.parallelstreams;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * How parallel stream uses multiple Threads
 * 
 * @author soufrk
 *
 */
public class ParallelStream02 {
    
    public static void main1(String... args) {
        int[] numbers = {1, 6, 2, 9, 10};
        Arrays.stream(numbers)
            .parallel()
            .forEach(s->System.out.println("Thread Name:" + Thread.currentThread().getName()))
            ;
    }
    
    public static void main(String... args) throws InterruptedException, ExecutionException {
        int[] numbers = {1, 6, 2, 9, 10, 7, 3, 0};
        
        ForkJoinPool f = new ForkJoinPool(2);
        int sum = f.submit(()->
            Arrays.stream(numbers)
            .parallel()
            .peek(e->System.out.format("Value:%d, Thread Name:%s\n", e, Thread.currentThread().getName()))
            .sum()
        ).get();
        System.out.println("Sum=" + sum);
    }
}
