package com.progra2.homework;

public class ListImpl implements List {
    private Node first;
    private Node last;

    @Override
    public void add(Integer value) {
        if (value == null) return;//third scenario
        Node node = new Node(value);
        if (this.last == null) {//first scenario
            this.first = node;
            this.last = node;
        } else {//second scenario
            node.setPrevious(this.last);
            this.last.setNext(node);
            this.last = node;
        }
    }

    @Override
    public boolean remove(Integer value) {
        if (value == null) return false;//fourth scenario
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                if (current.getNext() != null && current.getPrevious() != null) {
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                } else if (current.getNext() == null && current.getPrevious() != null) {//second scenario
                    current.getPrevious().setNext(null);
                    last = current.getPrevious();
                } else if (current.getNext() != null && current.getPrevious() == null) {//third scenario
                    current.getNext().setPrevious(null);
                    first = current.getNext();//Move reference for first node
                } else {//sixth scenario: list only have one node
                    first = null;
                    last = null;
                }
                return true;//fifth scenario
            }
            current = current.getNext();
        }
        return false;//fifth scenario
    }

    @Override
    public Integer nextOf(Integer value) {
        if (value == null) return null;//fifth scenario:
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                //first, second  and third scenario
                return current.getNext() != null ? current.getNext().getValue() : null;
            }
            current = current.getNext();
        }
        return null;//Alternatively we can throw an exception to indicate value not exist into the list
    }

    @Override
    public Integer previousOf(Integer value) {
        if (value == null) return null;//fifth scenario
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                //first, second  and third scenario
                return current.getPrevious() != null ? current.getPrevious().getValue() : null;
            }
            current = current.getNext();
        }
        return null;//Alternatively we can throw an exception to indicate value not exist into the list
    }

    @Override
    public String toString() {
        if (first == null) return "";// second scenario
        Node current = first;
        String value = "";
        while (current != null) {
            value += current.getValue() + " ";//first scenario
            current = current.getNext();
        }
        return value;
    }
}
