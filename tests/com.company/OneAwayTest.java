package com.company;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ricky Valencia on 11/27/16.
 */
public class OneAwayTest {
    private OneAway o = new OneAway();

    @Test
    public void testOneAwayWithOneRemoved() {
        assertTrue(o.isOneOrNoneAway("pale", "ple"));
    }

    @Test
    public void testOneAwayWithOneInsert() {
        assertTrue(o.isOneOrNoneAway("pales", "pale"));
    }

    @Test
    public void testOneAwayWithOneReplace() {
        assertTrue(o.isOneOrNoneAway("pale", "bale"));
    }

    @Test
    public void testOneAwayWithTwoReplaces() {
        assertFalse(o.isOneOrNoneAway("pale", "bales"));
    }

    @Test
    public void testOneAwayWithEmptyStrings() {
        assertFalse(o.isOneOrNoneAway("", ""));
    }

    @Test
    public void testOneAwayWithNullStrings() {
        assertFalse(o.isOneOrNoneAway(null, null));
    }

    @Test
    public void testOneAwayWithTwoDifferentStrings() {
        assertFalse(o.isOneOrNoneAway("hi", "hello"));
    }
}
