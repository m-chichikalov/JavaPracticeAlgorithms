package Algorithms.BubbleSort;

import Algorithms.SortAbstract;

public class BubbleSort extends SortAbstract {
    private int[] data;

    public BubbleSort(int[] inputArray) {
        data = inputArray;
    }

    public int[] ascendingSort() {
        return sort(true);

    }

    public int[] descendingSort() {
        return sort(false);
    }

    /**
     * Simple native implementation of Bubble sort. (ascending and descending order)
     *
     * @param ascending - boolean flag that show algorithm in which direction
     *                    it should be ordered
     * @return sorted array (the same size as the original array)
     */
    private int[] sort(boolean ascending) {
        int i, j;
        int n = data.length - 1;

        for (i = 0; i < n; i++) {
            for (j = 0; j < (n - i); j++) {
                if (ascending && data[j] > data[j + 1]) {
                    //swap
                    data[j] = swap(data[j+1], data[j+1] = data[j]);
                } else if (!ascending && data[j] < data[j + 1]) {
                    data[j] = swap(data[j+1], data[j+1] = data[j]);
                }
            }
        }
        return data;
    }
}
