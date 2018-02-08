package Algorithms.SelectionSort;

import Algorithms.SortAbstract;

public class SelectionSort extends SortAbstract {

    private int[] data;

    public SelectionSort(int[] inputArray) {
        data = inputArray;
    }

    public int[] ascendingSort() {
        return sort(true);

    }

    public int[] descendingSort() {
        return sort(false);
    }

    /**
     * Simple native implementation of selection sort. (ascending and descending order)
     *
     * @param ascending - boolean flag that show algorithm in which direction
     *                    it should be ordered
     * @return sorted array (the same size as the original array)
     */
    private int[] sort(boolean ascending) {
        int n = data.length;

        for (int i = 0; i < n; i++) {
            int swapIndex = i;

            for (int j = (i+1); j < n; j++) {
                if (( ascending && data[j] < data[swapIndex]) ||
                    (!ascending && data[j] > data[swapIndex])) {
                    swapIndex = j;
                }
            }
            //swap if find
            if (swapIndex != i) {
                data[i] = swap(data[swapIndex], data[swapIndex] = data[i]);
            }
        }

        return data;
    }
}


