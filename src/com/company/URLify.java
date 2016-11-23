package com.company;

public class URLify {
    /*
    Initial Thoughts:
    Does the string have sufficient length?
    Check my edge cases: is url empty? is url null?
     */
    public char[] URLify(char[] url, int len) {
        if (len == 0 || url == null) {
            return url;
        }
        for (int i = 0; i < len; ++i) {
            if (url[i] == ' ') {
                url = shiftTwice(url, i + 1);
                url = replaceSpace(url, i);
            }
        }
        return url;
    }

    private char[] replaceSpace(char[] url, int start) {
        char[] space = "%20".toCharArray();
        for (int i = 0; i < 3; ++i) {
            url[start+i] = space[i];
        }
        return url;
    }

    private char[] shiftTwice(char[] url, int start) {
        for (int i = 0; i < 2; ++i) {
            for(int k = url.length-1; k > start; --k) {
                url[k] = url[k-1];
            }
        }
        return url;
    }
}
