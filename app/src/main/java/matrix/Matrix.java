package matrix;

public class Matrix {
	private int rows, cols;
	private int[][] values;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		values = new int[rows][cols];
	}

	public Matrix(int rows, int cols, int[][] init_values) {
		this(rows,cols);

		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				values[i][j] = init_values[i][j];
			}
		}
	}

	public void print() {
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.printf("%4d ", values[i][j]);
			}
			System.out.println("");
		}
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public int[][] getValues() {
		return values;
	}

	public int getValueAt(int i, int j) {
		return values[i][j];
	}

	public void setValueAt(int i, int j, int value) {
		values[i][j] = value;
	}

	public boolean equalTo(Matrix other) {
		if (rows != other.rows || cols != other.cols) {
			return false;
		}

		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (getValueAt(i,j) != other.getValueAt(i,j)) {
					return false;
				}
			}
		}

		return true;
	}
}
