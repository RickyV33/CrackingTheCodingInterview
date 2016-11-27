package com.company;

public class OneAway {

    public boolean isOneOrNoneAway(String s, String r) {
        if (s == null || r == null || s.length() == 0 || r.length() == 0) {
            return false;
        }
        if (s.length() == r.length()) {
            return checkReplace(s, r);
        } else if (s.length() - r.length() == 1 || s.length() - r.length() == -1) {
            return checkInsertOrRemove(s, r);
        }
        return false;
    }

    private boolean checkReplace(String s, String r) {
        int replaceCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != r.charAt(i)) {
                ++replaceCount;
                if (replaceCount >= 2) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkInsertOrRemove(String s, String r) {
        String longString = s.length() - r.length() > 0 ? s : r;
        String shortString = s.length() - r.length() < 0 ? s : r;
        int diffCount = 0;
        for (int i = 0, k = 0; k < shortString.length();) {
            if (longString.charAt(i) != shortString.charAt(k)) {
                ++diffCount;
                ++i;
                if(diffCount >= 2) {
                    return false;
                }
            } else {
                ++i;
                ++k;
            }
        }
        return true;
    }
}
