package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class RotateMatrixTest {
    RotateMatrix rm = new RotateMatrix();

    @Test
    public void testRotateMatrixWithValidMatrix() {
        int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int [][] result = {{13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4}};
        rm.rotateMatrix(matrix);
        assertArrayEquals(result, matrix);
    }

    @Test
    public void testRotateMatrixWithLargeValidMatrix() {
        int [][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        int [][] result = {{21,16,11,6,1}, {22,17,12,7,2}, {23,18,13,8,3}, {24,19,14,9,4}, {25,20,15,10,5}};
        rm.rotateMatrix(matrix);
        assertArrayEquals(result, matrix);
    }
}
