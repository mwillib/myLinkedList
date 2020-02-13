package com.company;

public class Node {
    String data;
    Node next = null;

    public Node(Object dataVal) {
        data = (String) dataVal;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

