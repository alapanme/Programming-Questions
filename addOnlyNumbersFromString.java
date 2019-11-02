package stringsArrays;

public class addOnlyNumbersFromString {
	
	public static void main (String Args[]) {
	
	String s = "abc4ldk5ldl8oro9oo1";
	char[] sArray = s.toCharArray();
	int sum=0;
	
	for (int i=0;i<=sArray.length-1;i++) {
		if (Character.isDigit(sArray[i])) {
			sum = sum + Character.getNumericValue(sArray[i]);	
		}
	}
	System.out.println(sum);

	}

}
