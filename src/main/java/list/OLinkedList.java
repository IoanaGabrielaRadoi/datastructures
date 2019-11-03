package list;

public class OLinkedList<E> implements OIList<E>, OIDequeue<E>, OIIterable<E>{


    @Override
    public OIIterator<E> iterator() {
        return new OLinkedListIterator<>();
    }


    public void reverse(){

    }

    private class OLinkedListIterator<E> implements OIIterator<E>{

        Node current = first;

        public boolean hasNext() {
            return first.next!=null;
        }

        public E next() {
            E aux = (E) current.element;
            current = current.next;
            return aux;
        }


        public void remove() {
            remove();
        }


    }

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> previous;
    }

    private Node<E> first;
    private Node<E> last;

    @Override
    public int size() {
        return 0;
    }

    //add Last
    @Override
    public void add(E e) {
        Node newLast = new Node();
        newLast.element = e;
        if (last == null){
            last = newLast;
            first = last;
        } else {
            newLast.previous = last;
            last.next = newLast;
            last = newLast;
        }
    }

    @Override
    public void add(int index, E e) {
        Node current = first;
        for (int i = 0; i<index; i++){
            current = current.next;
        }
        Node newElement = new Node();
        newElement.element = e;

        newElement.next = current;
        newElement.previous = current.previous;

        if (current.previous!=null) {
            current.previous.next = newElement;
        } else {
            first = newElement;
        }
        current.previous = newElement;

    }

    @Override
    public void remove(E e) {
        Node current = first;
        while (current!=null && !current.element.equals(e)){
            current = current.next;
        }
        if (current!=null) {
            if (current.previous==null){
                first = current.next;
                first.previous = null;
            } else {
                current.previous.next = current.next;
            }
            if (current.next == null){
                last = current.previous;
            }
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        Node current = first;
        for (int i =0; i<index; i++){
            current = current.next;
        }

        return (E) current.element;
    }

    @Override
    public void addLast(E e) {
        add(e);
    }

    @Override
    public void addFirst(E e) {
        Node newFirst = new Node();
        newFirst.element = e;
        newFirst.next = first;

        if (first!=null) {
            this.first.previous = newFirst;
        }

        first = newFirst;

        if (last == null){
            last = first;
        }
    }

    @Override
    public void removeFirst() {
        if (first.next == null){
            first = null;
            last = null;
        } else {
            first = first.next;
        }
    }

    @Override
    public E getFirst() {
        return first.element;
    }

    @Override
    public E getLast() {
        return last.element;
    }

}
