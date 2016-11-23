package com.company;

public class Palindrome {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        int len = s.length();
        if (len == 0) {
            return false;
        }
        for (int i = 0, k = len - 1; i < len && k >= 0; ++i, --k) {
            while (s.charAt(i) == ' ') {
                ++i;
            }
            while (s.charAt(k) == ' ') {
                --k;
            }
            if (s.charAt(i) != s.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
