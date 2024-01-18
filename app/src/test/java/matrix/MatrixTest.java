package matrix;

import exceptions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
	@DisplayName("Negative size should trigger an InvalidSizeException")
	@Test
	public void testNegativeSize() {
		assertThrows(InvalidSizeException.class, () -> new Matrix(-1,1));
		assertThrows(InvalidSizeException.class, () -> new Matrix(1,-1));
		assertThrows(InvalidSizeException.class, () -> new Matrix(0,1));
		assertThrows(InvalidSizeException.class, () -> new Matrix(1,0));
	}

	@DisplayName("Valid size should create a matrix without errors")
	@Test
	public void testValidSize() {
		assertDoesNotThrow(() -> new Matrix(1,1));
	}
}
