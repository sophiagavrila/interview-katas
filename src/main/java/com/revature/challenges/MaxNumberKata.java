package com.revature.challenges;

public class MaxNumberKata {

    /**
     * Write a Java method findMax that takes an integer array arr as input and returns the
     * maximum value in the array.
     *
     * If the input array is empty, the method should return -1.
     * Each integer of the input array is unique, there are no duplicate values.
     */
    public static int findMax(int[] arr) {
        // your code here
        if(arr.length==0) return -1;

        int maximum = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>maximum){
                maximum = i;
            }
        }
        return maximum;
    }

}
