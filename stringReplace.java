package stringsArrays;

public class stringReplace {
	
	public static void main (String args[]) {
		String result= replaceStringsWith ("The more you work hard the more lucky you get.");
		System.out.println("The replaced string is: " + result);	
	}
	
	public static String replaceStringsWith (String s1) {
		
		String words[] = s1.split(" ");
		StringBuilder sentence = new StringBuilder(words[0]);
		for (int i=1; i<=words.length - 1; i++) {
			sentence.append ("%20");
			sentence.append(words[i]);
		}
		return sentence.toString();
	}

}
