package list;

public interface OIQueue<E> {

    void addLast(E e);

    void removeFirst(); //poll

    E getFirst(); //peek
}
