package binaryoperation;

import java.util.HashSet;
import java.util.Set;

public class HashOperation {

	public static void main(String[] args) {
		int base = 15;
		int b = 0;
		//Set<Integer> setOfIndices = new HashSet<>();
		
		for(int i=0;i<20;i++){
			System.out.println("Iteration " + i);
			System.out.println(b & base);
			//setOfIndices.add(b & base);
			b++;
		}

		//System.out.println(setOfIndices);
	}

}
