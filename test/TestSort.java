import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSort {

    protected final int[] ascendingArray = {-1, -1, 3, 4, 5, 6, 7, 8, 9, 10};
    protected final int[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, -1, -1};
    protected final int[] shuffledArray = {10, -1, -1, 3, 9, 5, 8, 4, 7, 6};
    protected final int[] emptyArray = {};

    protected int[] ascending = new int[10];
    protected int[] descending = new int[10];
    protected int[] shuffled = new int[10];
    protected int[] empty = {};

    protected final int[] expectedArray = {-1, -1, 3, 4, 5, 6, 7, 8, 9, 10};

    Sorting mSorting;


    @Before
    public void setUp() {
        ascending = java.util.Arrays.copyOfRange(ascendingArray, 0, 10);
        descending = java.util.Arrays.copyOfRange(descendingArray, 0, 10);
        shuffled = java.util.Arrays.copyOfRange(shuffledArray, 0, 10);
        mSorting = null;
    }

    @Test
    public void testMergesort(){
        mSorting = new MergeSort();
        mSorting.sort(ascending);
        mSorting.sort(descending);
        mSorting.sort(shuffled);
        mSorting.sort(empty);
        assertArrayEquals(expectedArray, ascending);
        assertArrayEquals(expectedArray, descending);
        assertArrayEquals(expectedArray, shuffled);
        assertArrayEquals(emptyArray, empty);
    }

    @Test
    public void testQuickSort(){
        mSorting = new Quicksort();
        mSorting.sort(ascending);
        mSorting.sort(descending);
        mSorting.sort(shuffled);
        mSorting.sort(empty);
        assertArrayEquals(expectedArray, ascending);
        assertArrayEquals(expectedArray, descending);
        assertArrayEquals(expectedArray, shuffled);
        assertArrayEquals(emptyArray, empty);

    }

    @Test
    public void testInsertionSort(){
        mSorting = new InsertionSort();
        mSorting.sort(ascending);
        mSorting.sort(descending);
        mSorting.sort(shuffled);
        mSorting.sort(empty);
        assertArrayEquals(expectedArray, ascending);
        assertArrayEquals(expectedArray, descending);
        assertArrayEquals(expectedArray, shuffled);
        assertArrayEquals(emptyArray, empty);

    }
}
