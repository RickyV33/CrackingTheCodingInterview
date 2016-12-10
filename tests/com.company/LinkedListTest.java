package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedListTest {
    LinkedList ll = new LinkedList();

    @Before
    public void initLLL() {
        int num = 5;
        while (num > 0) {
            ll.add(num);
            --num;
        }
    }
    @Test
    public void testAdd() {
        assertEquals(5, ll.getLength());
        ll.add(30);
        assertEquals(6, ll.getLength());
        assertEquals("30 -> 1 -> 2 -> 3 -> 4 -> 5", ll.toString());
    }

    @Test
    public void testStringOverriding() {
        assertEquals("1 -> 2 -> 3 -> 4 -> 5", ll.toString());
    }

    @Test
    public void testRemoveDuplicates() {
        ll.add(1);
        ll.add(2);
        assertEquals("2 -> 1 -> 1 -> 2 -> 3 -> 4 -> 5", ll.toString());
        assertEquals(2, ll.removeDuplicates());
        assertEquals("2 -> 1 -> 3 -> 4 -> 5", ll.toString());
    }

    @Test
    public void testFindKthToLastItem() {
        assertEquals(3, ll.findKthToLastItem(3));
        assertEquals(2, ll.findKthToLastItem(4));
    }

    @Test
    public void testRemoveMiddleNodeWithEvenNodes() {
        ll.removeMiddleNode();
        assertEquals("1 -> 2 -> 4 -> 5", ll.toString());
    }

    @Test
    public void testRemoveMiddleNodeWithOddNodes() {
        ll.add(6);
        ll.removeMiddleNode();
        assertEquals("6 -> 1 -> 3 -> 4 -> 5", ll.toString());
    }

}
