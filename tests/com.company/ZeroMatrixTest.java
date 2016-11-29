package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ricky Valencia on 11/29/16.
 */
public class ZeroMatrixTest {
    ZeroMatrix z = new ZeroMatrix();
    int[][] matrix = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {3, 1, 2, 3, 4},
            {5, 6, 7, 8, 0}};
    int x = 4;
    int y = 5;

    @Test
    public void testZeroMatrixWithValidMatrix() {
        int[][] result = {
                {0, 0, 0, 0, 0},
                {0, 6, 7, 8, 0},
                {0, 1, 2, 3, 0},
                {0, 0, 0, 0, 0}};

        z.zeroMatrix(matrix, x, y);
        assertArrayEquals(result, matrix);
    }

    @Test
    public void testZeroMatrixWithNullMatrix() {
        int[][] originalMatrix = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {3, 1, 2, 3, 4},
                {5, 6, 7, 8, 0}};
        z.zeroMatrix(matrix, x, y);
        assertArrayEquals(matrix, originalMatrix);
    }
}
