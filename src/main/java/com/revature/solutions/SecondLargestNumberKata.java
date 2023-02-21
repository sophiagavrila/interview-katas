package com.revature.solutions;

import java.util.List;

public class SecondLargestNumberKata {

    /**
     * Write a Java method that takes in a list of integers and returns the second
     * largest integer in the list.  The list may or may not have duplicates.
     *
     * If the list is empty or contains only one element, the method should return -1.
     *
     * For example: if nums = {1, 2, 3, 4, 5, 6}, return 5.
     * If nums = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}, return 4.
     */
    public static int findSecondLargest(List<Integer> nums) {
        if (nums == null || nums.size() < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMax;
    }

}
