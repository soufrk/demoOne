package generics.syntax;

import java.util.List;

public final class TheGenericMaxFinderProblem {

    public static <T> T max(T x, T y) {
	return x > y ? x : y;
    }

    public static void print(List<? extends Number> list) {
	for (Number n : list)
	    System.out.print(n + " ");
	System.out.println();
    }

}
