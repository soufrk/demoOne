package basics;

class TestingClass {
	public void test(String s) {
		System.out.println("String");
	}

	public void test(Object o) {
		System.out.println("Object");
	}
	
	public void test(Integer o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		TestingClass q = new TestingClass();
		q.test(null);
	}
}