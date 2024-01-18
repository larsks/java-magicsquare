package magicsquare;

public class MagicSquare {
	private int size;
	private int[][] numbers;

	public MagicSquare(int desiredSize) throws InvalidSizeException {
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
		numbers = new int[size][size];

		int row = 0;
		int col = size/2;
		int val = 1;
		for (int i=0; i<size*size; i++) {
			numbers[row][col] = val;
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

	public int[][] getNumbers() {
		return numbers;
	}

	public void printSquare() {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.printf("%4d ", numbers[i][j]);
			}
			System.out.println("");
		}
	}
}
