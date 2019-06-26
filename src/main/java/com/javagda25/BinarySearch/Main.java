package com.javagda25.BinarySearch;

// implementacja binary search

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 8, 9};
        System.out.println(binarySearch(array, 2));
        System.out.println(binarySearchRecursive(array, 6, 0, array.length - 1));
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
            } else {
                indexRightBound = index - 1;
            }

            index = (indexRightBound + indexLeftBound) / 2;
            value = array[index];

        }
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int searchValue, int indexLeftBound, int indexRightBound) {
        if (indexLeftBound <= indexRightBound) {
            int index = (indexRightBound + indexLeftBound) / 2;
            int value = array[index];
            if (value == searchValue) {
                return index;
            }
            if (value > searchValue) {
                return binarySearchRecursive(array, searchValue, indexLeftBound, index - 1);
            }
            return binarySearchRecursive(array, searchValue, index + 1, indexRightBound);
        }
        return -1;
    }
}
