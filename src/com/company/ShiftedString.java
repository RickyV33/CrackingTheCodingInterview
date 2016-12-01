package com.company;

/**
 * Created by Ricky Valencia on 12/1/16.
 */
public class ShiftedString {
    /*
    Initial Thoughts:
    Java doesn't have an isSubstring() method so I made one on the spot.
    Both strings should be case sensitive
     */
    public boolean isShifted(String s, String r) {
        if (s == null || r == null || s.length() == 0 || r.length() == 0) {
            return false;
        }
        String dub = r + r;
        for (int i = 0; i < dub.length() - s.length(); ++i) {
            String substring = dub.substring(i, i + s.length());
            if (s.equals(substring)) {
                return true;
            }
        }
        return false;
    }
}
