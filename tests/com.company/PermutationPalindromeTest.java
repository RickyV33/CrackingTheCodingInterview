package com.company;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class PermutationPalindromeTest {
    private PermutationPalindrome p = new PermutationPalindrome();

    @Test
    public void testPermutationPalindromeWithValidString() {
        assertTrue(p.isPermutationPalindrome("aabbccd"));
    }

    @Test
    public void testPermutationPalindromeWithSymbols() {
        assertFalse(p.isPermutationPalindrome("aabbccd??@@><#"));
    }

    @Test
    public void testPermutationPalindromeWithCaptials() {
        assertFalse(p.isPermutationPalindrome("aabbCcd"));
    }

    @Test
    public void testPermutationPalindromeWithInvalidString() {
        assertFalse(p.isPermutationPalindrome("aabbccdc"));
    }

    @Test
    public void testPermutationPalindromeWithEmptyString() {
        assertFalse(p.isPermutationPalindrome(""));
    }

    @Test
    public void testPermutationPalindromeWithNullString() {
        assertFalse(p.isPermutationPalindrome(null));
    }
}
