package stringsArrays;

import java.util.Scanner;

public class palindrome {
	
	public static void main (String args[]) {
		
		String original, reverse = "";
		
		Scanner input = new Scanner(System. in);
		System.out.println("Enter a String to check whether its Palindrome or not: ");
		original = input. nextLine();
		
		for(int i=original.length()-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if (original.equals(reverse)) {
			System.out.println("String is Palindrome.");
		}
		
		else {
			System.out.println("String is not Palindrome.");
		}
	}

}
