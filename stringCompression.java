package stringsArrays;

public class stringCompression {
	
	public static void main (String args[]) {
		
		int sum=1;
		String output="";
		String input = "aabbccdd";
		
		for (int i=0; i<input.length()-1; i++) {
			if (input.charAt(i) == input.charAt(i+1)) {
				sum++;
			}
			else {
				output = output + input.charAt(i) + sum; //a2 a2b2 a2b2c2 a2b2c2
				sum = 1;
			}
		}
		output = output + input.charAt(input.length() - 1) + sum;
		System.out.println(output);
	}
}
