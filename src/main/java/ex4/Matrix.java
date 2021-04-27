package ex4;

public class Matrix {
    int rows;
    int columns;

    int[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    public Matrix(int rowsAndColumns) {
        this(rowsAndColumns, rowsAndColumns);

    }

public Matrix() {
        this(2);
}
}
