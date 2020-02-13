package com.company;

import java.util.List;

public class MyLinkedList {

    private int count;
    private Node firstNode;

    public MyLinkedList() {
    }

    public void add(Object data) {

    if (firstNode == null) {
        firstNode = new Node(data);
    }

    Node temp = new Node(data);
    Node current = firstNode;

    while (current.getNext() != null) {
        current = current.getNext();
    }
    current.setNext(temp);
    count++;
    }

    public Object get(int index) {
        Node current = null;
        if (firstNode != null) {
            current = firstNode.getNext();
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }
        return null;
    }

}

