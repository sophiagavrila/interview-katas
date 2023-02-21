package com.revature.solutions;

public class BinarySearchKata {

    /**
     * Write a Java method chop that takes an integer parameter target and an array of integers arr,
     * and returns the index of the target value in the array using a binary search algorithm.
     *
     * For example: the arr {1, 3, 5, 7, 9}; with target 3 will return 1.
     * The arr {4, 5, 6, 7, 8}; with target 8 will return 4.
     *
     * If the target value is not in the array, the method should return -1.
     *
     * You may assume that the input array arr will always be sorted in ascending order, and that it
     * will not contain any duplicate values.
     */
    public static int chop(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
