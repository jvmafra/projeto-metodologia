import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSort2 {

    int[] array1 = {-1};
    int[] expected1 = {-1};

    int[] empty = {};
    int[] expectedEmpty = {};

    int[] arrayNegativeValues = {-3, -1, -10, -2, -50, -2, -1, -40, -1, -5};
    int[] expectedArrayNegativeValues = {-50, -40, -10, -5, -3, -2, -2, -1, -1, -1};

    int[] arrayPositiveValues = {7, 1, 2, 3, 50, 4, 0, 10, 5, 0};
    int[] expectedArrayPositiveValues = {0, 0, 1, 2, 3, 4, 5, 7, 10, 50};

    int[] mixedArray = {50, 1, 0, -2, -1, 1, 7, 2, 1, -50};
    int[] expectedMixedArray = {-50, -2, -1, 0, 1, 1, 1, 2, 7, 50};

    protected int[] arrayOneElement = new int[10];
    protected int[] negativeValues = new int[10];
    protected int[] positiveValues = new int[10];
    protected int[] mixed = new int[10];



    Sorting mSorting;


    @Before
    public void setUp() {
        arrayOneElement = java.util.Arrays.copyOfRange(array1, 0, 1);
        negativeValues = java.util.Arrays.copyOfRange(arrayNegativeValues, 0, 10);
        positiveValues = java.util.Arrays.copyOfRange(arrayPositiveValues, 0, 10);
        mixed = java.util.Arrays.copyOfRange(mixedArray, 0, 10);

    }

    @Test
    public void testMergesort(){
        mSorting = new MergeSort();
        mSorting.sort(array1);
        mSorting.sort(arrayOneElement);
        mSorting.sort(negativeValues);
        mSorting.sort(empty);
        mSorting.sort(positiveValues);
        mSorting.sort(mixed);
        assertArrayEquals(expected1, arrayOneElement);
        assertArrayEquals(expectedArrayNegativeValues, negativeValues);
        assertArrayEquals(expectedArrayPositiveValues, positiveValues);
        assertArrayEquals(expectedEmpty, empty);
        assertArrayEquals(expectedMixedArray, mixed);
    }

    @Test
    public void testQuickSort(){
        mSorting = new Quicksort();
        mSorting.sort(array1);
        mSorting.sort(arrayOneElement);
        mSorting.sort(negativeValues);
        mSorting.sort(empty);
        mSorting.sort(positiveValues);
        mSorting.sort(mixed);
        assertArrayEquals(expected1, arrayOneElement);
        assertArrayEquals(expectedArrayNegativeValues, negativeValues);
        assertArrayEquals(expectedArrayPositiveValues, positiveValues);
        assertArrayEquals(expectedEmpty, empty);
        assertArrayEquals(expectedMixedArray, mixed);

    }

    @Test
    public void testInsertionSort(){
        mSorting = new InsertionSort();
        mSorting.sort(array1);
        mSorting.sort(arrayOneElement);
        mSorting.sort(negativeValues);
        mSorting.sort(empty);
        mSorting.sort(positiveValues);
        mSorting.sort(mixed);
        assertArrayEquals(expected1, arrayOneElement);
        assertArrayEquals(expectedArrayNegativeValues, negativeValues);
        assertArrayEquals(expectedArrayPositiveValues, positiveValues);
        assertArrayEquals(expectedEmpty, empty);
        assertArrayEquals(expectedMixedArray, mixed);

    }
}
