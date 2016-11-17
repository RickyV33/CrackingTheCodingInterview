package com.company;

import java.util.HashMap;

/**
 * Created by Slick on 11/17/16.
 */
public class Permutation {
    public boolean isPermutation(String a, String b) {
        HashMap<Character, Integer> occur = new HashMap();
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
