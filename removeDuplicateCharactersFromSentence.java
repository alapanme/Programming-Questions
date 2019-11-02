package stringsArrays;

import java.util.HashSet;

public class removeDuplicateCharactersFromSentence {
	
	public static void main (String args[]) {
		
		String sen = "I looove mmmyyy lifeee";
		String senArr[]	= sen.split(" ");
		HashSet <Character> set = new HashSet<Character> ();
		StringBuffer str = new StringBuffer();
		
		for (int i=0; i<senArr.length; i++) {
			for (int j=0; j<senArr[i].length(); j++) {
				Character c = senArr[i].charAt(j);
				if (!set.contains(c)) {
					set.add(c);
					str.append(c);
				}
			}
			set.clear();
			str.append(" ");
		}
	System.out.println(str);	
	
	}
}
