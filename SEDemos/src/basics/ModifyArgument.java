package basics;

/**
 * So, how do you think modifying variables in a method behave ?
 * What about object references ?
 * @author soufrk
 *
 */
public class ModifyArgument {

	static int x;
	static Integer y;
	
	public static void main(String[] args) {
		
		System.out.println(changeX(x));
		System.out.println(x);
		
		System.out.println(changeY(y));
		System.out.println(y);
		
		MyNumber m = new MyNumber();
		System.out.println(m);
		System.out.println(changeMyNumber(m));
		System.out.println(m);

	}
	
	private static int changeX(int x) {
		x++;
		System.out.println(x);
		return x;
	}
	
	private static Integer changeY(Integer y){
		y++;
		System.out.println(y);
		return y;
	}
	
	private static MyNumber changeMyNumber(MyNumber m){
		m.x++;
		System.out.println(m);
		return m;
	}
	
	static class MyNumber{
		int x;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		@Override
		public String toString() {
			return "MyNumber [x=" + x + "]";
		}
		
	}

}
