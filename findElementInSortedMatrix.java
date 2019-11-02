/*Search in a row wise and column wise sorted matrix
Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”. In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.
Example :

Input : mat[4][4] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
              x = 29
Output : Found at (2, 1)*/

package stringsArrays;

public class findElementInSortedMatrix {
	
	public static void main (String args[]) {
		
		int mat[][] = { {10, 20, 30, 40}, 
                {15, 25, 35, 45}, 
                {27, 29, 37, 48}, 
                {32, 33, 39, 50} }; 
		int n=4;
		
		for (int row=0; row<=n-1; row++) {
			for (int col=0; col<=n-1; col++ ) {
				if (mat[row][col] == 29) {
					System.out.println("Element Found at: " + "(" + row + "," + col + ")");
				}
			}
		}
		
	}
}
