package SelectionSort;

public class SelectionSort {

    public static int[] ascendingSort(int[] data) {
        return sort(data, true);

    }

    public static int[] descendingSort(int[] data) {
        return sort(data, false);
    }

    /**
     * Simple native implementation of selection sort. (ascending and descending order)
     *
     * @param data - input array (integer)
     * @param ascending - boolean flag that show algorithm in which direction
     *                    it should be ordered
     * @return sorted array (the same size as the original array)
     */
    private static int[] sort(int[] data, boolean ascending) {
        int n = data.length;
        int temp;

        for (int i = 0; i < n; i++) {
            int swap = data[i];
            int swapIndex = i;

            for (int j = (i+1); j < n; j++) {
                if (ascending && data[j] < swap) {
                    swap = data[j];
                    swapIndex = j;
                } else if (!ascending && data[j] > swap) {
                    swap = data[j];
                    swapIndex = j;
                }
            }
            //swap if find
            if (swapIndex != i) {
                temp = data[i];
                data[i] = swap;
                data[swapIndex] = temp;
            }
        }

        return data;
    }
}


