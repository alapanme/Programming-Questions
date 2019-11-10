package dailyProgrammingQuestions;

import java.util.Arrays;

public class findLowestPossibleInteger {

//	Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//
//	For example, the input [3, 4, -1, 1] should give 2.

	public static void main(String args[]) {
		int[] a = { 3,4,-1,1 };

		Arrays.sort(a); 
		int curr = 0, prev = 0, flag=0;

		for (int i = 0; i <= a.length-1; i++) {

			curr = i;
			
			if (curr==a.length-1 && flag==0) {
				curr=curr+1;
				System.out.println(curr);
			}
			else if (a[curr] - a[prev] == 1 || a[curr] + a[prev] == 1 || a[curr] - a[prev] == -1 || 
					a[curr] + a[prev] == 1 || a[curr] - a[prev] == 0) {
				i++;
			}
			else {
				System.out.println(curr);
				flag++;
			}
			prev = curr;
		}

	}

}
