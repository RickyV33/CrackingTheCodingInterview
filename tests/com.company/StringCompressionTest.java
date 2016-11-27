package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class StringCompressionTest {
    private StringCompression sc = new StringCompression();

    @Test
    public void testCompressStringWithString() {
        assertEquals("a2b1c5a3", sc.compressString("aabcccccaaa"));
    }

    @Test
    public void testCompressStringWithNullString() {
        assertEquals("", sc.compressString(null));
    }

    @Test
    public void testCompressStringWithEmptyString() {
        assertEquals("", sc.compressString(""));
    }

    @Test
    public void testCompressStringWithLongerCompressedString() {
        assertEquals("ab", sc.compressString("ab"));
    }

    @Test
    public void testCompressStringWithFourLetterString() {
        assertEquals("a2b2", sc.compressString("aabb"));
    }
}
