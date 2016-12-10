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

    /*
    Initial Thoughts:
    I can either use another data structure such as a hashmap and keep a count
    of data occurences. As soon as I get data that already has a count of 1,
    then remove that node. This requires (worst case) O(N) space.
    Additionally, I could recursively move through the array where each Node
    checks the remaining data in the list for duplicates. I'll need a helper function.
    This won't use any additional space outside of the recursive stack. Both
    might require carrying a previous pointer.
    Time complexity is at least O(N)
     */
    public int removeDuplicates() {
        if (this.head == null || this.length == 1) {
            return 0;
        }
        return removeDuplicates(this.head.getData(), this.head.getNext(), this.head);
    }

    private int removeDuplicates(int data, Node current, Node previous) {
        if (current == null) {
            return 0;
        }
        if (data == current.getData()) {
            previous.setNext(current.getNext());
            return removeDuplicates(current.getData(), current.getNext(), previous) + 1;
        }
       return removeDuplicates(current.getData(), current.getNext(), current);
    }
}
