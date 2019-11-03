package list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleListTest {

    @Test
    public void sigleListTestAddFirst() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();

        oSingleLinkedList.addFirst(3);
        assertEquals(Integer.valueOf(3), oSingleLinkedList.getFirst());
        assertEquals(Integer.valueOf(3), oSingleLinkedList.getLast());
    }

    @Test
    public void sigleListTestAddLast() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();

        oSingleLinkedList.addLast(5);
        assertEquals(Integer.valueOf(5), oSingleLinkedList.getFirst());
        assertEquals(Integer.valueOf(5), oSingleLinkedList.getLast());
    }

    @Test
    public void sigleListTestRemoveLast() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();


        oSingleLinkedList.addLast(5);
        oSingleLinkedList.addFirst(3);

        oSingleLinkedList.removeFirst();

        assertEquals(Integer.valueOf(5), oSingleLinkedList.getFirst());
        assertEquals(Integer.valueOf(5), oSingleLinkedList.getLast());
    }

    @Test
    public void sigleListTestRemove() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();


        oSingleLinkedList.addLast(5);
        oSingleLinkedList.addFirst(3);

        oSingleLinkedList.remove(3);

        assertEquals(Integer.valueOf(5), oSingleLinkedList.getFirst());
        assertEquals(Integer.valueOf(5), oSingleLinkedList.getLast());
    }

    @Test
    public void sigleListTestRemove2() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();


        oSingleLinkedList.addLast(5);
        oSingleLinkedList.addFirst(3);

        oSingleLinkedList.remove(5);

        assertEquals(Integer.valueOf(3), oSingleLinkedList.getFirst());
        assertEquals(Integer.valueOf(3), oSingleLinkedList.getLast());
    }

    @Test
    public void singleListReverse() {
        OSingleLinkedList<Integer> oSingleLinkedList = new OSingleLinkedList<>();


        oSingleLinkedList.addLast(1);
        oSingleLinkedList.addLast(2);
        oSingleLinkedList.addLast(3);
        oSingleLinkedList.addLast(4);
        oSingleLinkedList.addLast(5);
        oSingleLinkedList.addLast(6);
        oSingleLinkedList.addLast(7);

        oSingleLinkedList.print();

        System.out.println("-------");

        oSingleLinkedList.reverse();

        oSingleLinkedList.print();

        System.out.println("-------");
        oSingleLinkedList.printRecursiveLeftRight();
        System.out.println("-------");
        oSingleLinkedList.printRecursiveRighLeft();




    }
}
