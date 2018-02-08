package Algorithms.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest  extends Assert{

    final static int[] evenArray = {5,10,14,20,30,40,56,189,300,400};
    final static int[] oddArray = {5,10,14,20,30,40,56,189,300};

    @Test
    public void evenArrayTest() {

        int result = new BinarySearch(evenArray).search(40);
        assertEquals(5, result);
    }

    @Test
    public void oddArrayTest() {

        int result = new BinarySearch(oddArray).search(10);
        assertEquals(1, result);
        result = new BinarySearch(oddArray).search(300);
        assertEquals(8, result);
    }

    @Test
    public void nullArrayTest() {

        int result = new BinarySearch(oddArray).search(11);
        assertEquals(-1, result);
    }
}