package stringsArrays;

public class countCaharactersInString {
	
	public static void main (String args[]) {
		
		String s = "Alapan";
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			count ++;
		}
		System.out.println("Characters in the given String: " + count);
	}

}
