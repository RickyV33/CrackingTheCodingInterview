package com.company;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ricky Valencia on 12/1/16.
 */
public class ShiftedStringTest {
    ShiftedString s = new ShiftedString();

    @Test
    public void testIsShiftedWithValidStrings(){
        assertTrue(s.isShifted("waterbottle", "erbottlewat"));
    }

    @Test
    public void testIsShiftedWithInvalidStrings(){
        assertFalse(s.isShifted("waterbottler", "erbottlewat"));
    }

    @Test
    public void testIsShiftedWithEmptyStrings(){
        assertFalse(s.isShifted("", "erbottlewat"));
    }

    @Test
    public void testIsShiftedWithNullStrings() {
        assertFalse(s.isShifted(null, "erbottlewat"));
    }
}
