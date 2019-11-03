package list;

public interface OIStack<E> {

    void addFirst(E e);  //push

    void removeFirst();  //pop

    E getFirst(); //peek

}
