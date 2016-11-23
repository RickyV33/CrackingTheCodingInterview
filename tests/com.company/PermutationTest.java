package com.company;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ricky Valencia on 11/22/16.
 */
public class PermutationTest {
    private Permutation p = new Permutation();

    @Test
    public void testIsPermutationWithValidPermutation() {
        assertTrue(p.isPermutation("abcd", "cdad"));
    }

    @Test
    public void testIsPermutationWithInvalidPermutation() {
        assertFalse(p.isPermutation("abcd", "ctad"));
    }

    @Test
    public void testIsPermutationWithFirstNullString() {
        assertFalse(p.isPermutation(null, "cdad"));
    }

    @Test
    public void testIsPermutationWithSecondNullString() {
        assertFalse(p.isPermutation("abcd", null));
    }

    @Test
    public void testIsPermutationWithCapitalLetters() {
        assertTrue(p.isPermutation("abcd", "DCAB"));
    }

    @Test
    public void testIsPermutationWithEmptyString() {
        assertFalse(p.isPermutation("abcd", ""));
    }
}
