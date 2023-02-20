package com.revature.solutions;

public class MaxNumberKata {

    /**
     * Write a Java method findMax that takes an integer array arr as input and returns the
     * maximum value in the array.
     *
     * If the input array is empty, the method should return -1.
     * Each integer of the input array is unique, there are no duplicate values.
     */
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
