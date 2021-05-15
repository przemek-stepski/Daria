package ex4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MatrixTest {

    @Test
    void shouldReturnTrueIfMatrixEqualToOtherMatrix() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x2();

        assertTrue(testMatrix.equalto(other));
    }

    @Test
    void shouldReturnFalseIfMatrixOtherIsNull() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = null;

        assertFalse(testMatrix.equalto(other));
    }

    @Test
    void shouldReturnFalseIfMatrixNotEqualToOtherMatrix() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x2();
        other.matrix[0][0] = 88;

        assertFalse(testMatrix.equalto(other));
    }

    @Test
    void shouldReturnFalseIfMatrixDifferentSize() {
        Matrix testMatrix = makeMatrix2x2();
        Matrix other = makeMatrix2x3();

        assertFalse(testMatrix.equalto(other));
    }

    @Test
    void shouldReturnResultOfAddingMatrix() {
        Matrix testMatrix = makeMatrix2x2();
        testMatrix.addWith(testMatrix);

        Matrix resultMatrix = new Matrix(2);
        resultMatrix.matrix[0][0] = 0;
        resultMatrix.matrix[0][1] = 2;
        resultMatrix.matrix[1][0] = 2;
        resultMatrix.matrix[1][1] = 4;

        assertArrayEquals(resultMatrix.matrix, testMatrix.matrix);
    }

    @Test
    void shouldReturnTrueIfOtherMatrixDifferentSize() {
        Matrix firstMatrix = makeMatrix2x2();
        Matrix originalMatrix = makeMatrix2x2();
        Matrix otherMatrix = makeMatrix2x3();

        firstMatrix.addWith(otherMatrix);

        assertTrue(firstMatrix.equalto(originalMatrix));
    }

    @Test
    void shouldReturnFalseIfOtherMatrixSameSize() {
        Matrix firstMatrix = makeMatrix2x2();
        Matrix originalMatrix = makeMatrix2x2();
        Matrix otherMatrix = makeMatrix2x2();

        firstMatrix.addWith(otherMatrix);

        assertFalse(originalMatrix.equalto(firstMatrix));
    }

    @Test
    void shouldReturnTrueIfAddingMatrixSucceed() {
        Matrix testMatrix = makeMatrix2x2();
        try {
            Matrix resultMatrix = testMatrix.add(testMatrix);
            Matrix otherMatrix = makeMatrix2x2v2();
            assertTrue(resultMatrix.equalto(otherMatrix));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void shouldReturnFalseIfOtherMatrixSameSizeAddMethod() throws Exception {
        Matrix firstMatrix = makeMatrix2x2();
        Matrix otherMatrix = makeMatrix2x2();

        Matrix resultMatrix = firstMatrix.add(otherMatrix);

        assertFalse(resultMatrix.equalto(firstMatrix));
    }

    @Test
    void shouldThrowMatrixExceptionIfMatrixDifferentSizeAddMethod() {
        Matrix firstMatrix = makeMatrix2x2();
        Matrix otherMatrix = makeMatrix2x3();

        assertThrows(MartixDifferntSizeException.class, ()->firstMatrix.add(otherMatrix));
    }

//    @Test(expected = NullPointerException.class)
//    public void whenExceptionThrown_thenExpectationSatisfied() {
//        Matrix firstMatrix = makeMatrix2x2();
//        Matrix otherMatrix = makeMatrix2x3();
//        Matrix result = firstMatrix.add(otherMatrix);
//
    //}

    @Test
    void shouldReturnResultOfTransposingMatrix() {
        Matrix testMatrix = makeMatrix2x2v3();
        testMatrix.transpose();

        Matrix resultMatrix = new Matrix(2);
        resultMatrix.matrix[0][0] = 1;
        resultMatrix.matrix[0][1] = 3;
        resultMatrix.matrix[1][0] = 2;
        resultMatrix.matrix[1][1] = 4;

        assertArrayEquals(resultMatrix.matrix, testMatrix.matrix);
    }

    @Test
    void shouldReturnTrueIfMatrixIsIdentity() {
        Matrix identity = makeMatrix2x2v4();
        Matrix resultMatrix = Matrix.identityMatrix(2);

        assertTrue(resultMatrix.equalto(identity));
    }

    public Matrix makeMatrix2x2() {
        Matrix testMatrix = new Matrix(2,2);
        testMatrix.matrix[0][0] = 0;
        testMatrix.matrix[0][1] = 1;
        testMatrix.matrix[1][0] = 1;
        testMatrix.matrix[1][1] = 2;
        return testMatrix;
    }

    public Matrix makeMatrix2x2v2() {
        Matrix testMatrix = new Matrix(2,2);
        testMatrix.matrix[0][0] = 0;
        testMatrix.matrix[0][1] = 2;
        testMatrix.matrix[1][0] = 2;
        testMatrix.matrix[1][1] = 4;
        return testMatrix;
    }


    public Matrix makeMatrix2x2v3() {
        Matrix testMatrix = new Matrix(2,2);
        testMatrix.matrix[0][0] = 1;
        testMatrix.matrix[0][1] = 2;
        testMatrix.matrix[1][0] = 3;
        testMatrix.matrix[1][1] = 4;
        return testMatrix;
    }
    public Matrix makeMatrix2x2v4() {
        Matrix testMatrix = new Matrix(2,2);
        testMatrix.matrix[0][0] = 1;
        testMatrix.matrix[0][1] = 0;
        testMatrix.matrix[1][0] = 0;
        testMatrix.matrix[1][1] = 1;
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
