package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class Node {
    private int data;
    private Node next;

    Node(int data) {
        this.data = data;
    }

    int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
