package com.javagda25.BinarySearch;

// implementacja binary search

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 8, 9};
        System.out.println(binarySearch(array, 2));
    }

    public static int binarySearch(int[] array, int searchValue) {
        int indexLeftBound = 0;
        int indexRightBound = array.length - 1;
        int index = (indexRightBound + indexLeftBound) / 2;
        int value = array[index];

        while (indexLeftBound <= indexRightBound) {
            if (value == searchValue) {
                return index;
            } else if (value < searchValue) {
                indexLeftBound = index + 1;
            } else if (value > searchValue) {
                indexRightBound = index - 1;
            }

            index = (indexRightBound + indexLeftBound) / 2;
            value = array[index];

        }
        return -1;
    }
}
