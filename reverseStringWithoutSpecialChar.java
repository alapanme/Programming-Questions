package stringsArrays;

public class reverseStringWithoutSpecialChar {
	
	public static void main (String args[]) {
		
		String s = "ab,cd$";
		char[] sChar = s.toCharArray();
		int l=0;
		int r = s.length()-1;
		char temp;
		
		
		while (l<r) {
			
			if (!Character.isAlphabetic(sChar[l])) {
				l++;
			}
			else if (!Character.isAlphabetic(sChar[r])) {
				r--;
			}
			else {
				temp = sChar[l];
				sChar[l]=sChar[r];
				sChar[r]=temp;
				l++;
				r--;
			}	
		}
		//String convertToString = new String(sChar);
		//System.out.println(convertToString);
		System.out.println(sChar);
	}

}
