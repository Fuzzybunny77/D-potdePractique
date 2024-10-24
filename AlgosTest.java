import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AlgosTest {
    ArrayList<Integer> test;

    @Test
    public void testSequentialSearchWithEmptyArray() {
        int[] a = {}; // vide
        test = new ArrayList<>(); // vide
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, 0).toArray());
    }

    @Test
    public void testSequentialSearchWithTargetNotFound() {
        int[] a = { 1, 2, 3, 4 };
        test = new ArrayList<>(); // vide
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, 5).toArray());
    }

    @Test
    public void testSequentialSearchWithTargetFoundOnce() {
        int[] a = { 1, 2, 3, 4 };
        // 2
        test = new ArrayList<>();
        test.add(1);
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, a[1]).toArray());
        // 4
        test = new ArrayList<>();
        test.add(3);
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, a[3]).toArray());
    }

    @Test
    public void testSequentialSearchWithTargetFoundManyTimes() {
        int[] a = { 1, 2, 3, 4, 3, 4, 3, 2, 3, 3 };
        // 2
        test = new ArrayList<>();
        test.add(1);
        test.add(7);
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, a[1]).toArray());
        // 3
        test = new ArrayList<>();
        test.add(2);
        test.add(4);
        test.add(6);
        test.add(8);
        test.add(9);
        assertArrayEquals(test.toArray(), Algos.sequentialSearch(a, a[2]).toArray());
    }
}
