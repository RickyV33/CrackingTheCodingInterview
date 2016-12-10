package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedLists {
    private Node head;

    public void add(int data) {
        Node temp = new Node(data);
        temp.next = this.head;
        this.head = temp;
    }

}
