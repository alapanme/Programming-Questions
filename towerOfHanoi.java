package recursion;

public class towerOfHanoi {

	public static void move(int noOfDiscs, char from, char to, char inter) {
		
		if (noOfDiscs == 1) {
			System.out.println("Move Disc 1" + " from " + from + " to " + to);
		}
		else {
		move (noOfDiscs -1, from, inter, to );
		System.out.println("Move Disc " + noOfDiscs + " from " + from + " to " + to);
		move (noOfDiscs -1, inter, to, from);
		}
	}

	public static void main(String args[]) {
		move(5, 'A', 'C', 'B');
	}

}
 