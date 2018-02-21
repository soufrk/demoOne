package colne;

/**
 * If you clone a class that has a composed member, will it get copied
 * too?
 * 
 * If so, is the copied composed member as the one in the original
 * instance ?
 * 
 * @author soufrk
 *
 */
/* --------------------------------- Part 1 -------------------------------- */
public class CloningWithCompositionProblem implements Cloneable {
    
    private Composed composedObject;

    public CloningWithComposition(Composed composedObject) {
	super();
	this.composedObject = composedObject;
    }

    public static void main(String[] args) {
	CloningWithComposition object1 = new CloningWithComposition(new Composed(1));
	try {
	    CloningWithComposition object2 = (CloningWithComposition) object1.clone();
	    System.out.println(object2);
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}	
    }

    @Override
    public String toString() {
	return "CloningWithComposition [composedObject=" + composedObject + "]";
    }

}

class Composed {
    private int id;
    public Composed(int id) {
	this.id = id;
    }
    public int getId() {
	return id;
    }
    @Override
    public String toString() {
	return "Composed [id=" + id + "]";
    }
}

/* --------------------------------- Part 2 -------------------------------- */
public class CloningWithCompositionProblem implements Cloneable {
    
    private ComposedOfComposed composedObject;

    public CloningWithComposition(ComposedOfComposed composedObject) {
	super();
	this.composedObject = composedObject;
    }

    public static void main(String[] args) {
	Composed c1 = new Composed(1);
	ComposedOfComposed c2 = new ComposedOfComposed(c1, "A");
	CloningWithComposition object1 = new CloningWithComposition(c2);
	try {
	    CloningWithComposition object2 = (CloningWithComposition) object1.clone();
	    System.out.println(object2);
	    System.out.println(object2.composedObject == c2);
	    System.out.println(object2.composedObject.getComposed() == c1);
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}	
    }

    @Override
    public String toString() {
	return "CloningWithComposition [composedObject=" + composedObject + "]";
    }

}

class ComposedOfComposed {
    private Composed composed;
    private String name;
    public ComposedOfComposed(Composed composed, String name) {
	super();
	this.composed = composed;
	this.name = name;
    }
    @Override
    public String toString() {
	return "ComposedOfComposed [composed=" + composed + ", name=" + name + "]";
    }
    public Composed getComposed() {
        return composed;
    }
}
