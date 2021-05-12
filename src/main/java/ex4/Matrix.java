package ex4;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private int rows;
    private int columns;

    int[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public Matrix(int rowsAndColumns) {
        this(rowsAndColumns, rowsAndColumns);
    }

    public Matrix(Matrix a) {
        this.rows = a.rows;
        this.columns = a.columns;
        this.matrix = new int[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.set(i,j, a.matrix[i][j]);
            }
        }
    }

    public int rows() {
        return rows;
    }

    public int columns() {
        return columns;
    }

    public int get(int rows, int columns) {
        return matrix[rows][columns];
    }

    public void set(int rows, int columns, int newValue) {
        matrix[rows][columns] = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return rows == matrix1.rows && columns == matrix1.columns && Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rows, columns);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    public boolean equalto(Matrix other) {
        if (this == other) return true;
        if (other == null || this.rows != other.rows || this.columns != other.columns) {
            return false;
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.get(i, j) != other.get(i, j)) return false;
            }
        }
        return true;
    }

    public void addWith(Matrix other) {
        if (other == null || this.rows != other.rows || this.columns != other.columns) {
            System.out.println("You can only addWith matrix of the same size");
        } else {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.set(i, j, this.get(i, j) + other.get(i, j));
                }
            }
        }
    }

    /**
     * This add method accept Matrix object and returns Matrix object which is a sum of original Matrix and param
     * @param other Matrix of the same size as original.
     * @return Matrix object which is a sum of two Matrix - orginal and param
     * @throws Exception when param is different size Matrix or null.
     */
    public Matrix add(Matrix other) throws Exception {
        Matrix resultMatrix = new Matrix(other.rows(), other.columns);

        if (other == null || this.rows != other.rows || this.columns != other.columns) {
            throw new Exception("You can only add matrix of the same size");

        } else {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    resultMatrix.set(i, j, this.get(i, j) + other.get(i, j));
                }
            }
        }
        return resultMatrix;
    }

    public void transpose() {
        if (this.rows != this.columns) {
            System.out.println(" I can only transpose square Matrix - sorry ;-(");
        } else {
            final Matrix matrixCopy = new Matrix(this);

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.set(i, j, matrixCopy.get(j, i));
                }
            }
        }
    }

    public static Matrix identityMatrix(int n) {
        Matrix ideMatrix = new Matrix(n);
        for (int i = 0; i < ideMatrix.rows; i++) {
            for (int j = 0; j < ideMatrix.columns; j++) {
                if (i == j) {
                    ideMatrix.matrix[i][j] = 1;
                }
            }
        }
        return ideMatrix;
    }
}



