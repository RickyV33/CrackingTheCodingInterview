package com.company;

import java.util.HashMap;
import java.util.Map;

public class Unique {
    /*
    Initial Thoughts:
    Is it case sensitive? - assume no
    What is the character set? ASCII VS Extended ASCII VS UTF-8
    Can we ignore whitespace?
    Is memory an issue?
     */
    public boolean isUnique(String s) {
        Map<Character, Integer> occur = new HashMap<>();
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if (occur.containsKey(current)) {
                return false;
            } else {
                occur.put(current, 1);
            }
        }
        return true;
    }

    public boolean isUniqueTwo(String s) {
        if (s == null || s.length() == 0) {
            return false;
        } else if (s.length() == 1) {
            return true;
        }
        return isUniqueHelper(s.substring(1), s.charAt(0));
    }

    private boolean isUniqueHelper(String sub, Character cur) {
        int length = sub.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; ++i) {
            char next = sub.charAt(i);
            if (next == cur) {
                return false;
            }
        }
        return isUniqueHelper(sub.substring(1), sub.charAt(0));
    }
}
