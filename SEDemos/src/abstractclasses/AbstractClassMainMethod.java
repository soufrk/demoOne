package abstractclasses;

/**
 * Can main method in an abstract class be executed ?
 * Corollary, does an instances of class get created when 
 * JVM executes main() ?
 * @author soufrk
 *
 */
public abstract class AbstractClassMainMethod extends Base {

  public static void main(String[] args) {
    Base b = new Base();
    b.print();
  }

}

class Base {
  public void print() {
    System.out.println("Printing");
  }
}
