package com.company;

import java.util.ArrayList;

/**
 * Created by Ricky Valencia on 11/29/16.
 */
public class ZeroMatrix {
    public void zeroMatrix(int[][] matrix, int m, int n) {
        ArrayList<ArrayList<Integer>> coords = new ArrayList<>();
        if (matrix == null || m == 0 || n == 0) {
            return;
        }

        for (int x = 0; x < m; ++x) {
            for (int y = 0; y < n; ++y) {
                if (matrix[x][y] == 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(y);
                    coords.add(temp);
                }
            }
        }
        for (ArrayList<Integer> coord: coords) {
            zeroRowAndColumn(matrix, m, n, coord);
        }
    }

    private void zeroRowAndColumn(int[][] matrix, int m , int n, ArrayList<Integer> coord) {
        for (int y = 0; y < n; ++y) {
            matrix[coord.get(0)][y] = 0;
        }
        for (int x = 0; x < m; ++x) {
            matrix[x][coord.get(1)] = 0;
        }
    }
}
