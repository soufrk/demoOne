package algorithms;

public class Combination {
	
	static int[][] RESULT;

	public static void main(String[] args) {
		int []input = {1,2,3,4};
		int size = 3;
		System.out.println(checkCombination(input, size));
	}
	
	public static int checkCombination(int[] input, int size){
		int length = input.length;
		if(length < size){
			System.out.println("Window size less than length.");
			return -1;
		}
		else if(length == size){
			System.out.println("Window size equal to length.");
			return 0;
		}
		else{
			int combinations = factorial(length, size);
			System.out.println("Combination possible: " + combinations);
			RESULT = new int[combinations][size];
			generateCombinations(input, size);
			return 1;
		}
	}
	
	public static int factorial(int length, int size){
		//System.out.println("Length=" + length + " Size=" + size);
		int result = 1;
		int boundary = length-size;
			while(length > boundary){
				/*System.out.println("Length=" + length + " Size=" + size);
				System.out.println("Result=" + result);*/
				//length--;
				result *= length--;
			}
		return result;
	}
	
	public static void generateCombinations(int [] input, int size){
		
	}

}
