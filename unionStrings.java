package stringsArrays;

import java.util.HashSet;

public class unionStrings {
	
	public static void main (String args[]) {
		
		String a = "Him";
		String b = "Him";	
		HashSet<Character> set = new HashSet<Character>();
		String c = a + b;
		char[] charArray = c.toCharArray();
		StringBuffer strBuff = new StringBuffer();
		
		for (int i=0; i<=charArray.length - 1; i++) {
			
			if (!set.contains(charArray[i])) {
				
				set.add(charArray[i]);
				strBuff.append(charArray[i]);
			}
			
		}
		System.out.println(strBuff);
	}

}
