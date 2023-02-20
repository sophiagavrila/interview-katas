package com.revature.solutions;

public class ArtihmeticArrayKata {

    /**
     * Write a Java method findMissingNumber(int[] arr) that takes an array of n-1 integers, where
     * the integers are in the range from 1 to n. The method should find the missing number in the array
     * and return it.
     *
     * For example, if the input array is [1, 2, 4, 6, 3, 7, 8], the output should be 5, which is the missing number.
     * If the input array is [2, 3, 4, 5, 6], the output should be 1, which is the missing number.
     *
     * Assume that the input array will always have at least one missing number and that no
     * numbers will be duplicated in the input array.
     */
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return sum - arrSum;
    }


}
