package com.company;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class PermutationPalindrome {

    /*
    Initial Thoughts:
    Can whitespace be ignored?
    Can puncuation be ignored?
    Can numbers be ignored? - Fail when integer is found
    Is it safe to assume only letters are applicable? let's assume yes. NO symbols
    Is it case sensitive? - let's assume it is.
    EDGE CASES: empty string, null string.
    */
    public boolean isPermutationPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        HashMap<Character, Integer> map = getFrequencyMap(s);
        int oddCharCount = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (isValidCharacter(entry.getKey())) {
                if (entry.getValue() % 2 == 1) {
                    ++oddCharCount;
                }
            } else {
                return false;
            }
        }
        return oddCharCount < 2;
    }

    private HashMap<Character, Integer> getFrequencyMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);
            int value = hashMap.getOrDefault(currentChar, 0);
            hashMap.put(currentChar, ++value);
        }
        return hashMap;
    }

    private boolean isValidCharacter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
