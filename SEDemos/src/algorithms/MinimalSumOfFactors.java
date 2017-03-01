package algorithms;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MinimalSumOfFactors {

	public static void main(String[] args) {
		int input = 16;
		List<Factors> listOfFactors = new LinkedList<>();
		//int factorCounter = 0;
		for(int i=1;i<input/2;i++){
			
			if(input % i == 0){
				Factors factor = new Factors(i, input/i);
				listOfFactors.add(factor);
			}

		}
		
		for(Factors temp:listOfFactors)
			System.out.println(temp);
		
		Set<Factors> sortedFactors = new TreeSet<>(
		new Comparator<Factors>(){
			@Override
			public int compare(Factors o1, Factors o2) {
				int sumO1 = o1.x + o1.y;
				int sumO2 = o2.x + o2.y;
				return sumO1 - sumO2;
			}
		});
		sortedFactors.addAll(listOfFactors);
		
		System.out.println(sortedFactors);

	}

}

class Factors{
	
	public Factors(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	int x;
	int y;
	@Override
	public String toString() {
		return "Factors [x=" + x + ", y=" + y + "]";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}