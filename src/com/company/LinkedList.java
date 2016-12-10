package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedList {
    private Node head;
    private int length;

    void add(int data) {
        Node temp = new Node(data);
        temp.setNext(this.head);
        this.head = temp;
        ++length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }

    public int getLength() {
        return length;
    }
}
