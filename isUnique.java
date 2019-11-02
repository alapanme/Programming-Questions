package stringsArrays;

public class isUnique {
	
	public static void main(String args[]) {
		
		int count = 0;
		String s = "Alapan";
		char a[] = s.toCharArray();
		
		for(int i=0; i<=a.length-1; i++) {
			if (s.indexOf(a[i]) != s.lastIndexOf(a[i])) {
				count++;
				}
		}
		
		if (count >=1) {
			System.out.println("The String has duplicate characters.");
		}
		
		else {
			System.out.println("The String has all unique characters.");
		}
}
}