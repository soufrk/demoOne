package functionals;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Four broad classes of functional interfaces.
 * 
 * @author soufrk
 *
 */
public class BasicInterfaces {

    public static void main(String[] args) {
	// 1. Suppliers
	Supplier<Integer> mySupplier = new Supplier<Integer>() {

	    @Override
	    public Integer get() {
		return 42;
	    }

	};

	// 2. Consumers
	Consumer<Integer> myConsumer = new Consumer<Integer>() {

	    @Override
	    public void accept(Integer t) {
		System.out.println(t);
	    }
	    
	};
	
	// 3. Predicates
	Predicate<Integer> myPredicate = new Predicate<Integer>() {

	    @Override
	    public boolean test(Integer t) {
		return t > 42;
	    }
	    
	};
	
	// 4. Functions
	Function<Integer, Long> myFunction = new Function<Integer, Long>() {

	    @Override
	    public Long apply(Integer t) {
		return (long)t;
	    }
	    
	}
    }

}
