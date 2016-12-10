package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedList {
    private Node head;
    private int length;

    public void add(int data) {
        Node temp = new Node(data);
        temp.setNext(this.head);
        this.head = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            sb.append(current);
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

    public int getLength() {
        return length;
    }
}
