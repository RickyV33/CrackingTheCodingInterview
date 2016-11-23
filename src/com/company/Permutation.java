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
        if (a == null || b == null || a.length() == 0 ||
                b.length() == 0 || a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); ++i) {
            char current = a.charAt(i);
            int count = occur.getOrDefault(current, 0);
            occur.put(current, ++count);
        }
        for (int i = 0; i < b.length(); ++i) {
            char current = b.charAt(i);
            int count = occur.getOrDefault(current, 0) - 1;
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
