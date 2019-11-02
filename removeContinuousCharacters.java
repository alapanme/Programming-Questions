package stringsArrays;

public class removeContinuousCharacters {
	
	public static void main(String args[]) {
		
		String s = "aabbcdee";
		StringBuffer str = new StringBuffer();
		
		for (int i=0; i<s.length()-2;i++) {
			if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2)) {
				str.append(s.charAt(i+1));
			}	
		}
		System.out.println(str);
	}

}
