package com.company;

public class PermutationPalindrome {

//    public boolean isPalindrome(String s) {
//        if (s == null) {
//            return false;
//        }
//        s = s.toLowerCase();
//        int len = s.length();
//        if (len == 0) {
//            return false;
//        }
//        for (int i = 0, k = len - 1; i < len && k >= 0; ++i, --k) {
//            while (s.charAt(i) == ' ') {
//                ++i;
//            }
//            while (s.charAt(k) == ' ') {
//                --k;
//            }
//            if (s.charAt(i) != s.charAt(k)) {
//                return false;
//            }
//        }
//        return true;
//    }

    /*
    Initial Thoughts:
    Can whitespace be ignored?
    Can puncuation be ignored?
    Can numbers be ignored?
    Is it safe to assume only letters are applicable?
    Is it case sensitive? - let's assume it is.
    EDGE CASES: empty string, null string.
    */
    public boolean isPermutationPalindrome(String s) {
        return true;
    }
}
