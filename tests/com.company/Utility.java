package com.company;

/**
 * Created by Ricky Valencia on 11/29/16.
 */
public class Utility {
    public void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; ++i) {
            for (int k = 0; k < m.length; ++k) {
                System.out.print(m[i][k]);
                System.out.print(", ");
            }
            System.out.println();
        }
    }

}
