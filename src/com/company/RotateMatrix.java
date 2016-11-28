package com.company;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class RotateMatrix {

    /*
    Initial Thoughts:
    You could store each row that you are copying over, but that would require
    storing an entire array's worth of data. Instead, we can move the data one by one.
    a1 a2 a3 a4 b1
    d4 e1 e2 f1 b2
    d3 h2 i1 f2 b3
    d2 h1 g2 g1 b4
    d1 c4 c3 c2 c1

    In the diagram above, we store a1 into a temp array, then move d1 into a1,
    c1 into d1, b1 into c1, and temp into b1. This continues as you increment through
    each layer (size/2). The offset should be the index you're on minus the layer.
    It's runtime is O(n^2).
     */
    public void rotateMatrix(int[][] m) {
        if (m == null || m.length == 1) {
            return;
        }
        for (int i = 0; i < m.length/2; ++i) {
            int end = m.length - i - 1;
            for (int k = i; k < end; ++k) {
                int offset = k - i;
                int first = m[i][k];
//                int second = m[end-offset][i];
//                int third = m[end][end-offset];
//                int fourth = m[k][end];
                m[i][k] = m[end-offset][i];
                m[end-offset][i] = m[end][end-offset];
                m[end][end-offset] = m[k][end];
                m[k][end] = first;
            }
        }

    }
}
