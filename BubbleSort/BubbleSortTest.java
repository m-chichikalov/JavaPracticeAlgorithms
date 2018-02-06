package BubbleSort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest extends Assert {
    final static int[] data = {5,10,14,2,0,-4,34,189,3};

    @Test
    public void ascendingSortTest() {

        int[] myResult = {-4,0,2,3,5,10,14,34,189};
        int[] result = BubbleSort.ascendingSort(data);

        assertArrayEquals(myResult, result);
    }

    @Test
    public void descendingSortTest() {

        int[] myResult = {189,34,14,10,5,3,2,0,-4};
        int[] result = BubbleSort.descendingSort(data);

        assertArrayEquals(myResult, result);
    }
}
