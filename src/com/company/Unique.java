package com.company;

import java.util.HashMap;
import java.util.Map;

public class Unique {
    public boolean isUnique(String s) {
        Map<Character, Integer> occur = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; ++i) {
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
        if (s.length() == 0) {
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
