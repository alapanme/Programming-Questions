package stringsArrays;

public class zeroEdits {

	public static void main(String args[]) {

		String str1 = "love";
		String str2 = "hate";

		System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
	}

	static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}

	public static int editDistance(String s1, String s2, int m, int n) {

		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}
		if (s1.charAt(m - 1) == s2.charAt(n - 1)) { // If last character is same
			return editDistance(s1, s2, m - 1, n - 1);
		} else {

			return 1 + min(editDistance(s1, s2, m, n - 1), // Insert to s1
					editDistance(s1, s2, m - 1, n), // Remove from s1
					editDistance(s1, s2, m - 1, n - 1) // Replace from s1
			);
		}
	}

}
