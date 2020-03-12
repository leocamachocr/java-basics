package com.progra2.references;

public class ReferenceList {
    public static void main(String args[]) {

        List list = new List();
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(14));
        list.add(Integer.valueOf(17));
        list.add(Integer.valueOf(21));
    }
}

class List {
    private Node node;

    public void add(Integer value) {
        Node next = new Node(value);
        if (node == null) {
            node = next;
        } else {
            node.next = next;
            next.previous = node;
            node = next;
        }
    }

    public void print() {
        //TODO display list
    }

    public void remove(Integer value) {
        //TODO implement remove logic here
    }

    public Node nextOf(Integer value) {
        //TODO implement logic to get next value of
        return null;
    }

    public Node previousOf(Integer value) {
        //TODO implement logic to get previous value of
        return null;
    }
}


class Node {
    Node next;
    Node previous;

    Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public String toString() {
        if (value == null) return "";
        return value.toString();
    }
}