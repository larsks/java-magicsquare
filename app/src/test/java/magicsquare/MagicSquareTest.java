package magicsquare;

import matrix.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {
	@Test
	public void testThreeByThree() {
		int want_values[][] = {{8,1,6},{3,5,7},{4,9,2}};
		MagicSquare have;
		Matrix want = new Matrix(3, 3, want_values);

		try {
			have = new MagicSquare(3);
			assertTrue(have.equalTo(want), "matrices do not match");
		} catch (Exception e) {
			fail();
		}
	}
}
