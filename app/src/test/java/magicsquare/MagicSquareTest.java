package magicsquare;

import matrix.Matrix;
import exceptions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {
	@DisplayName("A 3x3 magic square should have expected values")
	@Test
	public void testThreeByThree() {
		int want_values[][] = {{8,1,6},{3,5,7},{4,9,2}};
		MagicSquare have;
		Matrix want;

		try {
			want = new Matrix(3, 3, want_values);
		} catch (InvalidSizeException e) {
			fail();
			return;
		}

		try {
			have = new MagicSquare(3);
			assertTrue(have.equalTo(want), "matrices do not match");
		} catch (Exception e) {
			fail();
		}
	}

	@ParameterizedTest(name = "[{index}] A size of {0} should trigger an InvalidSizeException")
	@ValueSource(ints = {1, 8, 20}) // six numbers
	public void testInvalidSize(int size) {
		assertThrows(InvalidSizeException.class, () -> new MagicSquare(size));
	}

	@DisplayName("A valid size should not cause any errors")
	@Test
	public void testCreateValidSize() {
		assertDoesNotThrow(() -> new MagicSquare(3));
	}
}
