package threads;

public class ThreadTest extends Thread{
	
	private int i;
	
	public ThreadTest(){
		System.out.println("Constructor");
		i = 0;
		//start();
	}
	
	@Override
	public void run(){
		System.out.println("In Run");
		i += 2;
	}

	@Override
	public void start(){
		System.out.println("Start");
		i += 2;
	}
	
	public int showI(){
		return i;
	}
	
	public static void main(String[] args) {
		
		try {
			ThreadTest obj = new ThreadTest();
			obj.start();
			//obj.join();
			//System.out.println(((ThreadTest)obj).i);
			System.out.println(obj.isAlive());
			System.out.println(obj.showI());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
