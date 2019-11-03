package list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void arrayListTestAdd() {
        OIList<Integer> oArrayList = new OArrayList<>();

        oArrayList.add(3);
        oArrayList.add(0,5);
        assertEquals(Integer.valueOf(5), oArrayList.get(0));
        assertEquals(Integer.valueOf(3), oArrayList.get(1));
    }


    @Test
    public void arrayListTestRemove() {
        OIList<Integer> oArrayList = new OArrayList<>();

        oArrayList.add(3);
        oArrayList.add(0,5);

        oArrayList.remove(0);
        assertEquals(Integer.valueOf(3), oArrayList.get(0));

        oArrayList.add(7);
        assertEquals(Integer.valueOf(7), oArrayList.get(1));

        oArrayList.remove(Integer.valueOf(7));
        oArrayList.remove(Integer.valueOf(3));

        assertEquals(oArrayList.size(),0);
    }
}
