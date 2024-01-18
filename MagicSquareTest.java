package magicsquare;

public class MagicSquareTest {
	public void testThreeByThree() {
		int want[][] = {{8,1,6},{3,5,7},{4,9,2}};
		int have[][];

		try {
			MagicSquare ms = new MagicSquare(3);
			have = ms.getNumbers();

			for (int i=0; i<ms.getSize(); i++) {
				for (int j=0; j<ms.getSize(); j++) {
					assert have[i][j] == want[i][j] : String.format("expected (%d, %d) = %d, have %d", i, j, want[i][j], have[i][j]);
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
