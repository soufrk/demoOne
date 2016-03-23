package basics;

public class StackOverFlow {

	public static void main(String[] args) {
		Test t = new Test();
		t.str = "Hello";
		System.out.println(t.str);
	}

}

class Test{
	String str;
	//static Test t = new Test();
	Test t = new Test();
}
