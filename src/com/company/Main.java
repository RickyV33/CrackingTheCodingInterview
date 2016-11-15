package com.company;

public class Main {

    public static void main(String[] args) {
        Unique u = new Unique();
        System.out.println(u.isUniqueTwo("abcdefg"));
        System.out.println(u.isUniqueTwo("abcdefa"));
        System.out.println(u.isUniqueTwo("a1c"));
    }
}
