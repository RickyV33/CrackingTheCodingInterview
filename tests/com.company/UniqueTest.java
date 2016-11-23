package com.company;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueTest {
    private Unique unique = new Unique();
    @Test
    public void testIsUniqueWithUniqueString() {
        assertTrue(unique.isUnique("abcdefg"));
    }

    @Test
    public void testIsUniqueWithoutUniqueString() {
        assertFalse(unique.isUnique("abcdaefg"));
    }

    @Test
    public void testIsUniqueWithoutCaseSensitiveCharacters() {
        assertFalse(unique.isUnique("abcdA"));
    }

    @Test
    public void testIsUniqueWhenNull() {
        assertFalse(unique.isUnique(null));
    }

    @Test
    public void testIsUniqueWithEmptyString() {
        assertFalse(unique.isUnique(""));
    }

    @Test
    public void testIsUniqueWithSingleCharacter() {
        assertTrue(unique.isUnique("a"));
    }
}
