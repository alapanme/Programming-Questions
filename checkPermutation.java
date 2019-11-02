package stringsArrays;

import java.util.Arrays;

public class checkPermutation {
	
	public static void main (String args[]) {
		boolean result = checkStrings("listen", "silent");
		System.out.println("Is the Strings Permutable: " + result);
		
	}

	public static boolean checkStrings(String s1, String s2) {
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		else {
			char a[] = s1.toCharArray();
			char b[] = s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			return (Arrays.equals(a, b));
		}
		
	}
}
