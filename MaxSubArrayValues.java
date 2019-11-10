/*Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)*/

package dailyProgrammingQuestions;

import java.util.ArrayList;

public class MaxSubArrayValues {
	
	public static void main(String args[]) {
		
		int[] input = {10, 5, 2, 7, 8, 7};
		int k =3, l=3, big=0;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for (int i=0; i<=l; i++) {
			for(int j=i; j<=k-1; j++) {
				
				if (input[j] > big) {
					big = input[j]; 
				}
			}
			newArray.add(big);
			big=0;
			if (k<=input.length-1) {
			k=k+1;
			}
		}
		System.out.println(newArray);
	}

}
