package basics.ooad;

public class OverrideOrNot {

    public static void main(String[] args) {
	Parent p = new Parent();
	System.out.println(p.x);
	System.out.println(p.y);
	p.getSum4();
	
	Parent q = new Child();
	System.out.println(q.x);
	System.out.println(q.y);
	q.getSum4();
    }

}

class Parent{
    int x = 1;
    int y = 1;
    int getX(){
	return x;
    }
    int getY(){
	return y;
    }
    
    void getSum4(){
	System.out.println(x + y);
    }
}

class Child extends Parent {
    int x = 2;
    int y = 2;
    int getX(){
	return x;
    }
    int getY(){
	return y;
    }
    
    void getSum4(){
	System.out.println(x + y);
    }
}