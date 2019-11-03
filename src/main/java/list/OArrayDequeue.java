package list;

public class OArrayDequeue<E> implements OIDequeue<E> {

    private Object[] data;

    //priorityQueue exemplu
    //in loc de Object[] data ai un BinarySearchTree binarySearchTree
    //add (normal)
    // get - il iei pe cel mai din stanga, si vezi cum legi pe cel din dreapta daca exista de
    // parintele celui pe care il scoti


    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    public OArrayDequeue() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> previous;

    }

    private void resize(int capacity) {
        Object[] copy = new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E getLast() {
        return (E) data[size-1];
    }

    @Override
    public void addLast(E e) {
        if (size == data.length){
            resize(2*size);
        }
        data[size] = e;
    }

    @Override
    public void addFirst(E e) {
        int capacity;
        if (size == data.length){
            capacity = 2*size;
            Object[] copy = new Object[capacity];
            copy[0] = e;
            size++;
            for (int i = 0; i<size; i++){
                copy[i+1] = data[i];
            }
            data = copy;
        } else {
            for (int i = size; i>0; i--){
                data[i] = data [i-1];
            }
            data[0] = e;
            size++;
        }
    }

    @Override
    public void removeFirst() {
        for (int i = 0; i<size-1; i++){
            data[i] = data [i+1];
        }
        size--;
    }

    @Override
    public E getFirst() {
        return (E) data[0];
    }
}
