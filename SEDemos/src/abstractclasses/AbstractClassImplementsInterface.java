package abstractclasses;

/**
 * When implementing an interface, an abstract class,
 * <ul>
 * <li>may choose to not implement any methods at all</li>
 * <li>may not unknowingly try to redefine an overriden method.</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public abstract class AbstractClassImplementsInterface implements MyInterface03 {
    void show(int n) {
    }
    int display() {
	return 0;
    }
}

interface MyInterface03 {
    void show();
    void display();
}