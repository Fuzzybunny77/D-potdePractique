import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlgosDeux {
    @Test
    public void testIsSortedWithUnsorted() {
        int[] a = { 2, 1, 3, 4, 5 };
        assertEquals(false, AlgosDeux.isSorted(a));
    }

    @Test
    public void testIsSortedWithEqual() {
        int[] a = { 1, 1, 1, 1, 1 };
        assertEquals(true, AlgosDeux.isSorted(a));
    }

    @Test
    public void testIsSortedWithSorted() {
        int[] a = { 1, 2, 3, 4, 5 };
        assertEquals(true, AlgosDeux.isSorted(a));
    }


    private static boolean isSorted(int[] a) {
        return false;

    }



    }