package basics;

/**
 * Guess, which of the access-modifiers are permitted for method local fields.
 * 
 * @author soufrk
 *
 */
public class MethodLocalFieldModifier {

    public void show() {
	int x;
	private int y;
	protected int z;
	final int w;
	abstract int m;
	strictfp float n;
    }

}
