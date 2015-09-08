package pattern;

public class CharFinder {
	/*public static void main(String args[]) {
		String test = "abcabcabcdfgabacbdsha";
		String pattern = "a";
		Integer lastIndex = 0;
		int count = 0;
		while (lastIndex != -1) {
			lastIndex = test.indexOf(pattern, lastIndex);
			if (lastIndex != -1) {
				System.out.println("Found at:" + lastIndex);
				count++;
				lastIndex += pattern.length();
			}
		}
		System.out.println("Total Count:" + count);
	}*/
	
	public static void main(String args[]) {
		String test = "abcabcabcdfgabacbdsha";
		String pattern = "a";
		Integer lastIndex = 0;
		int count = -1;int indices = 0;
		//System.out.println(test);
		int foundAt = -1;
		do{
			foundAt = test.indexOf(pattern);
			System.out.format("Found At-%d, of %s\n",foundAt,test);
			//System.out.println("SubString\t- " + test.substring(foundAt+1));
			test = test.substring(foundAt+1);
			indices += foundAt + 1;
			System.out.format("Actual index-%d\n", indices);
			count++;
		}while(foundAt!= -1);
		System.out.println("Total Count-" + count);
	}
	
	public static void findInSubStr(Integer lastIndex, String pattern, String input){
		//int lastIndex = input.indexOf(pattern, lastIndex);
	}
}
