package com.company;

/**
 * Created by Ricky Valencia on 12/10/16.
 */
public class LinkedList {
    private Node head;

    void add(int data) {
        Node temp = new Node(data);
        temp.setNext(this.head);
        this.head = temp;
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
        return countLLL(this.head);
    }

    private int countLLL(Node current) {
        if (current == null) {
            return 0;
        }
        return countLLL(current.getNext()) + 1;
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
        if (this.head == null || getLength() == 1) {
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
       return removeDuplicates(data, current.getNext(), current) +
               removeDuplicates(current.getData(), current.getNext(), current);
    }

    /*
    Initial Thoughts:
    If you know the length of the linked list, then the Kth to last element is
    also the length - Kth node in the list.
    Assume all data is > 0. This will take O(N) to run.
     */
    public int findKthToLastItem(int k) {
        if (this.head == null) {
            return -1;
        }
        int length = getLength() - k;
        return findKthToLastItem(this.head, length, 0);
    }

    private int findKthToLastItem(Node current, int k, int count) {
        if (current == null) {
            return -1;
        }
        if (count == k) {
            return current.getData();
        }
        return findKthToLastItem(current.getNext(), k, ++count);
    }

    /*
    Initial Thoughts:
    This requires two pointers in the LLL: One that traverses slowly, and one
    that traverses 2 nodes for every 1 node the slow one traveses. When
    the fast pointer's next pointer is null, then the slow pointer is in the
    middle.
     */
    public void removeMiddleNode() {
        if (this.head == null || getLength() < 2) {
            return;
        }
        Node slowPrevious = null;
        Node slow = this.head;
        Node fast = this.head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slowPrevious = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        slowPrevious.setNext(slow.getNext());
    }
}
