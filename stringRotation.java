package stringsArrays;

public class stringRotation {

	public static boolean stringRotate(String s1, String s2) {

		return ((s1.length() == s2.length() && (s1 + s1).contains(s2)));
	}

	public static void main(String args[]) {

		if (stringRotate("abcd", "cdab")) {
			System.out.println("Rotation: True");
		}

		else {
			System.out.println("Rotation: False");
		}
	}
}
