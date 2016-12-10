package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedListTest {
    public LinkedList ll = new LinkedList();

    @Test
    public void testAdd() {
        assertEquals(ll.getLength(), 0);
    }
}
