package stringsArrays;

import java.util.Arrays;

public class reverseStringArray {
	
	public static void main(String args[]) {
		
		String[] myArray = {"now","here","is","Summer","The"};
		
		for (int i=0; i<myArray.length/2; i++) {
			String temp = myArray[i];
			myArray[i] = myArray[myArray.length-1-i];
			myArray[myArray.length-1-i] = temp;
		}
		System.out.println (Arrays.toString(myArray));
		
	}

}
