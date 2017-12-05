package basics;

/**
 * Guess what comes out as output.
 * 
 * @author soufrk
 *
 */
public class EnumDeclarationSyntax {

    private Types t;

    enum Types {
	private int i;

	A(1), B(2), C(3);

	private Types(int i) {
	    this.i = i;
	}

	public int getValue() {
	    return i;
	}
    }

    public EnumDeclarationSyntax(Types t) {
	this.t = t;
    }

    public static void main(String args[]) {
	new EnumDeclarationSyntax(Types.A).getValue();
    }

}
