package list;

import java.util.NoSuchElementException;

public class OSingleLinkedList<E> {

    private class Node<E> {
        E element;
        Node next;
    }

    private Node first;
    private Node last;

    public void reverse() {

        if (first == null){
            return;
        }

        Node current = first;

        Node previous = null;

        Node next = first.next;

        while (next != null) {
            current.next = previous;
            previous = current;
            current = next;
            next = next.next;
        }

        current.next = previous;

        last = first;
        first = current;


    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    public void printRecursiveLeftRight() {
        printRecLeftRight(first);
    }

    private void printRecLeftRight(Node n){
        if (n==null){
            return;
        }
        System.out.println(n.element);
        printRecLeftRight(n.next);
    }

    public void printRecursiveRighLeft() {
        printRecRighLeft(first);
    }

    private void printRecRighLeft(Node n){
        if (n==null){
            return;
        }
        printRecRighLeft(n.next);
        System.out.println(n.element);
    }




    public void addLast(E e) {
        Node newLast = new Node();
        newLast.element = e;

        if (last == null) {
            last = newLast;
            first = last;
            return;
        }

        last.next = newLast;
        last = newLast;
    }


    public void addFirst(E e) {
        Node newNode = new Node();
        newNode.element = e;
        newNode.next = first;
        first = newNode;

        if (last == null) {
            last = first;
        }

    }

    public void removeFirst() {
        if (first != null) {
            throw new IndexOutOfBoundsException();
        }
        first = first.next;
    }


    public void remove(E e) {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Node current = first;

        if (current.element.equals(e)) {
            first = current.next;

            if (first == null) {
                last = null;
            }

            return;
        }

        while (current.next != null && !current.next.element.equals(e)) {
            current = current.next;
        }

        if (current.next == null) {
            throw new NoSuchElementException();
        }

        current.next = current.next.next;

        if (current.next == null) {
            last = current;
        }


    }


    public E getFirst() {
        return (E) first.next.element;
    }


    public E getLast() {
        return (E) last.element;
    }

}
