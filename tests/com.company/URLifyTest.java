package com.company;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class URLifyTest {
    private URLify urlify = new URLify();

    @Test
    public void testURLifyWithValidString() {
        assertArrayEquals("this%20is%20a%20test".toCharArray(),
                urlify.URLify("this is a test      ".toCharArray(), 20));
    }

    @Test
    public void testURLifyWithEmptyString() {
        assertArrayEquals("".toCharArray(),
                urlify.URLify("".toCharArray(), 0));
    }

    @Test
    public void testURLifyWithNullStringAndValidSize() {
        assertArrayEquals(null, urlify.URLify(null, 6));
    }

    @Test
    public void testURLifyWithThreeSpaces() {
        assertArrayEquals("%20".toCharArray(),
                urlify.URLify("   ".toCharArray(), 3));
    }

    @Test
    public void testURLifyWithSingleCharacter() {
        assertArrayEquals("a".toCharArray(),
                urlify.URLify("a".toCharArray(), 1));
    }
}
