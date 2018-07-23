package generics.syntax;

public class TheGenericSingletonProblem<T> {
    
    public static T getInstance() {
        if (instance == null)
            instance = new TheGenericSingletonProblem<T>();
        return instance;
    }

    private static T instance = null;

}
