package com.company;

import java.util.HashMap;

public class Permutation {
    /*
    Initial Thoughts:
    Is parameter 'a' larger in size than 'b'?
    Are there duplicate letters?
    Is it case sensitive?
    Make sure to account for the null check.
    If they aren't the same size, then return false.
    Make every permutation of both strings and compare them. This leads to awful
    runtime: O(a! + b!).
    Permutations are just character counts: make a hash table.
     */
    public boolean isPermutation(String a, String b) {
        HashMap<Character, Integer> occur = new HashMap<>();
        if (a == null || b == null) {
            return false;
        }
        int aLen = a.length();
        int bLen = b.length();
        if (aLen != bLen) {
            return false;
        }
        for (int i = 0; i < aLen; ++i) {
            char current = a.charAt(i);
            int count = occur.getOrDefault(current, 0);
            occur.put(current, ++count);
        }
        for (int i = 0; i < bLen; ++i) {
            char current = b.charAt(i);
            int count = occur.getOrDefault(current, 0) - 1;
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
