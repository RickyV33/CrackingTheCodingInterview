package com.company;

public class Main {

    public static void main(String[] args) {
//        Unique u = new Unique();
//        System.out.println(u.isUniqueTwo("abcdefg"));
//        System.out.println(u.isUniqueTwo("abcdefa"));
//        System.out.println(u.isUniqueTwo("a1c"));
//        Permutation p = new Permutation();
//        System.out.println(p.isPermutation("abc", "bac"));
//        System.out.println(p.isPermutation("bbbac", "abcbb"));
//        System.out.println(p.isPermutation("abc", "c"));
//        System.out.println(p.isPermutation("abcdf", "kdfjd"));
//        URLify u = new URLify();
//        System.out.println(u.URLify("this is a test      ".toCharArray(), 20));
//        System.out.println(u.URLify("   ".toCharArray(), 3));
//        System.out.println(u.URLify("".toCharArray(), 0));
//        System.out.println(u.URLify("a".toCharArray(), 1));
//        System.out.println(u.URLify("this test  ".toCharArray(), 11));
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("taco cat"));
        System.out.println(p.isPalindrome("TacO cat"));
        System.out.println(p.isPalindrome("taco cap"));
        System.out.println(p.isPalindrome("tacocaT"));
        System.out.println(p.isPalindrome("tacocaT   "));
        System.out.println(p.isPalindrome("lkajsdf;lkj"));
        System.out.println(p.isPalindrome(""));
        System.out.println(p.isPalindrome(null));

    }
}
