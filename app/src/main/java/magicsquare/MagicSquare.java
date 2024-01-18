package magicsquare;

import matrix.Matrix;

public class MagicSquare extends Matrix {
	private int size;

	public MagicSquare(int desiredSize) throws InvalidSizeException {
		super(desiredSize, desiredSize);
		if (desiredSize < 3 || desiredSize > 17) {
			throw new InvalidSizeException("size must be 3 <= size <= 17");
		}

		if (desiredSize % 2 == 0) {
			throw new InvalidSizeException("size must be odd");
		}

		size = desiredSize;
		buildMagicSquare();
	}

	private void buildMagicSquare() {
		int row = 0;
		int col = size/2;
		int val = 1;
		for (int i=0; i<size*size; i++) {
			this.setValueAt(row, col, val);
			val++;

			if ((val-1)%size == 0) {
				row = (row+1) % size;
			} else {
				row--;
				col = (col + 1) % size;
			}

			if (row < 0) {
				row = size-1;
			}
		}
	}

	public int getSize() {
		return size;
	}
}
