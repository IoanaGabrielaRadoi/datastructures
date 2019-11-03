package list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void doubleLinkedListTestAdd() {
        OIList<Integer> oLinkedList = new OLinkedList<>();

        oLinkedList.add(3);
        oLinkedList.add(0, 7);

        assertEquals(Integer.valueOf(7), oLinkedList.get(0));
    }


    @Test
    public void doubleLinkedListTestAdd2() {
        OIList<Integer> oLinkedList = new OLinkedList<>();

        oLinkedList.add(3);
        oLinkedList.add(7);
        oLinkedList.add(9);
        oLinkedList.add(11);
        oLinkedList.add(2, 67);
        oLinkedList.add(3, 68);

        assertEquals(Integer.valueOf(3), oLinkedList.get(0));
        assertEquals(Integer.valueOf(7), oLinkedList.get(1));
        assertEquals(Integer.valueOf(67), oLinkedList.get(2));
        assertEquals(Integer.valueOf(68), oLinkedList.get(3));
        assertEquals(Integer.valueOf(9), oLinkedList.get(4));
        assertEquals(Integer.valueOf(11), oLinkedList.get(5));
    }

    @Test
    public void doubleLinkedListTestStack() {
        OIStack<Integer> oLinkedList = new OLinkedList<>();

        oLinkedList.addFirst(5);
        assertEquals(Integer.valueOf(5), oLinkedList.getFirst());
        oLinkedList.addFirst(8);
        assertEquals(Integer.valueOf(8), oLinkedList.getFirst());

        oLinkedList.removeFirst();
        assertEquals(Integer.valueOf(5), oLinkedList.getFirst());

    }

    @Test
    public void doubleLinkedListTestQueue() {
        OIQueue<Integer> oLinkedList = new OLinkedList<>();

        oLinkedList.addLast(5);
        assertEquals(Integer.valueOf(5), oLinkedList.getFirst());
        oLinkedList.addLast(8);
        assertEquals(Integer.valueOf(5), oLinkedList.getFirst());

        oLinkedList.removeFirst();
        assertEquals(Integer.valueOf(8), oLinkedList.getFirst());

    }


}
