package list;

public class OArrayList<E> implements OIList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size = 0;

    public OArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public OArrayList(int capacity) {
        data = new Object[capacity];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    //add Last
    @Override
    public void add(E e) {
        if (size == data.length) {
            resize(2 * size);
        }
        data[size++] = e;
    }

    @Override
    public void add(int index, E e) {
        int capacity;

        if (size == data.length){
            capacity = 2*size;
            Object[] copy = new Object[capacity];

            for (int i = 0; i<index; i++){
                copy[i] = data[i];
            }

            copy [index] = e;

            for (int i = index; i<size; i++){
                copy[i+1] = data[i];
            }

            data = copy;
        } else {
            for (int i = size; i>0; i--){
                data[i] = data [i-1];
            }
            data[index] = e;
        }

        size++;
    }

    @Override
    public void remove(E e) {
        int index = 0;
        while (!data[index].equals(e)) {
            index++;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    private void resize(int capacity) {
        Object[] copy = new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }
}
