
/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/

package dailyProgrammingQuestions;

import java.util.ArrayList;

public class multiplyExcepti {

	public static void main(String args[]) {

		int a[] = { 1,2,3,4,5 };
		int countForward = 1;
		int countBackward = 1;
		int count = 1;
		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			while (j < a.length) {
				countForward = countForward * a[j];
				j++;
			}
			int k = 0;
			while (k < i) {
				countBackward = countBackward * a[k];
				k++;
			}

			count = countForward * countBackward;
			b.add(count);
			countForward = 1;
			countBackward = 1;
			count = 1;
		}
		System.out.println(b);
	}

}
