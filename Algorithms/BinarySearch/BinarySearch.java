package Algorithms.BinarySearch;

import Algorithms.SearchAbstract;

public class BinarySearch extends SearchAbstract {

    int[] data;
    int startIndex, endIndex, middle;


    BinarySearch(int[] inputArray) {
        data = inputArray;
        startIndex = 0;
        endIndex = data.length;
        middle = getMiddle();
    }

    public Integer search( int valueLookingFor) {
        while ((endIndex - startIndex != 1)) {

            if (data[middle] < valueLookingFor) {
                startIndex = middle;
            } else if ((data[middle] > valueLookingFor)) {
                endIndex = middle;
            } else {
                break;
            }
            middle = getMiddle();
        }
        if (data[middle] == valueLookingFor) {
            return (middle);
        } else {
            return -1;
        }
    }

    private int getMiddle() {
        return (startIndex + (endIndex - startIndex)/2);
    }

}
