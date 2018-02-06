package BubbleSort;

public class BubbleSort {
    public static int[] ascendingSort(int[] data) {
        return sort(data, true);

    }

    public static int[] descendingSort(int[] data) {
        return sort(data, false);
    }

    /**
     * Simple native implementation of Bubble sort. (ascending and descending order)
     *
     * @param data - input array (integer)
     * @param ascending - boolean flag that show algorithm in which direction
     *                    it should be ordered
     * @return sorted array (the same size as the original array)
     */
    private static int[] sort(int[] data, boolean ascending) {
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

    private static int swap (int a, int b) { // y = swap(x, x=y);
        return a;
    }

}
