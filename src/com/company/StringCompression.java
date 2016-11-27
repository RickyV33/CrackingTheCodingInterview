package com.company;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class StringCompression {

    /*
    Initial Thoughts:
    only uses letters (capital and lowercase)
    Hash map is a bad idea because it combines similar letters into a bucket
    with only one count. We want ot separate groups of the same letter.
     */
    public String compressString(String s) {
        if (s == null || s.length() == 0) {
            return ""; // Avoid returning null
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (i == s.length() - 1) {
                sb.append(s.charAt(i));
                sb.append(count);
            } else {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    ++count;
                } else {
                    sb.append(s.charAt(i));
                    sb.append(count);
                    count = 1;
                }
            }
        }
        return sb.length() > s.length() ? s: sb.toString();
    }
}
