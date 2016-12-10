package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedListTest {
    LinkedList ll = new LinkedList();

    @Test
    public void testAdd() {
        assertEquals(0, ll.getLength());
        ll.add(30);
        assertEquals(1, ll.getLength());
        assertEquals("30", ll.toString());
    }

    @Test
    public void testStringOverriding() {
        assertEquals("", ll.toString());
        int num = 5;
        while (num > 0) {
            ll.add(num);
            --num;
        }
        assertEquals("1 -> 2 -> 3 -> 4 -> 5", ll.toString());
    }
}
