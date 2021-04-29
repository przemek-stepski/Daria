package ex4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixTest {

    @Test
    void shouldReturnTrueIfMatrixEqualToOtherMatrix() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x2();

        assertTrue(testMatrix.equalTo(other));
    }

    @Test
    void shouldReturnFaseIfMatrixOtherIsNull() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = null;

        assertFalse(testMatrix.equalTo(other));
    }

    @Test
    void shouldReturnFalseIfMatrixNotEqualToOtherMatrix() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x2();
        other.matrix[0][0] = 88;

        assertFalse(testMatrix.equalTo(other));
    }

    @Test
    void shouldReturnFalseIfMatrixDifferentSize() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x3();

        assertFalse(testMatrix.equalTo(other));
    }

    public Matrix makeMatrix2x2() {
        Matrix testMatrix = new Matrix(2,2);
        testMatrix.matrix[0][0] = 0;
        testMatrix.matrix[0][1] = 1;
        testMatrix.matrix[1][0] = 1;
        testMatrix.matrix[1][1] = 2;
        return testMatrix;
    }

    public Matrix makeMatrix2x3() {
        Matrix testMatrix = new Matrix(2,3);
        testMatrix.matrix[0][0] = 0;
        testMatrix.matrix[0][1] = 1;
        testMatrix.matrix[0][2] = 2;
        testMatrix.matrix[1][0] = 1;
        testMatrix.matrix[1][1] = 2;
        testMatrix.matrix[1][2] = 3;
        return testMatrix;
    }
}

//            @Test
//            void addWith () {
//            }
//
//            @Test
//            void add () {
//            }
//
//            @Test
//            void transpose () {
//            }