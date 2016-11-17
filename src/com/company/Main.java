package com.company;

public class Main {

    public static void main(String[] args) {
//        Unique u = new Unique();
//        System.out.println(u.isUniqueTwo("abcdefg"));
//        System.out.println(u.isUniqueTwo("abcdefa"));
//        System.out.println(u.isUniqueTwo("a1c"));
        Permutation p = new Permutation();
        System.out.println(p.isPermutation("abc", "bac"));
        System.out.println(p.isPermutation("bbbac", "abcbb"));
        System.out.println(p.isPermutation("abc", "c"));
        System.out.println(p.isPermutation("abcdf", "kdfjd"));

    }
}
