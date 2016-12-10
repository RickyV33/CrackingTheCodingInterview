package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class Node {
    private int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
