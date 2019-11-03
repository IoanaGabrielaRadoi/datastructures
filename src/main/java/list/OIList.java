package list;

public interface OIList<E>{

    int size();
    void add(E e);
    void add(int index, E e);

    void remove(E e);
    void remove(int index);

    E get(int index);

}
