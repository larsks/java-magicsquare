package magicsquare;

import matrix.Matrix;

public class MagicSquareTest {
	public void testThreeByThree() {
		int want_values[][] = {{8,1,6},{3,5,7},{4,9,2}};

		Matrix want = new Matrix(3, 3, want_values);
		try {
			MagicSquare have = new MagicSquare(3);

			for (int i=0; i<have.getSize(); i++) {
				for (int j=0; j<have.getSize(); j++) {
					if (want.getValueAt(i,j) != have.getValueAt(i,j)) {
						System.out.println("Have:");
						have.print();
						System.out.println("Want:");
						want.print();

						throw new AssertionError("matrices do not match");
					}
				}
			}
		} catch (InvalidSizeException err) {
			System.err.println("Unexpected error!");
		}

		System.out.println("testThreeByThree passed");
	}

	public static void main(String[] args) {
		MagicSquareTest tests = new MagicSquareTest();
		tests.testThreeByThree();
	}
}
