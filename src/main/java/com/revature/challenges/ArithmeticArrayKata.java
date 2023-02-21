package com.revature.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArithmeticArrayKata {

    /**
     * Write a Java method findMissingNumber(int[] arr) that takes an array of n-1 integers, where
     * the integers are in the range from 1 to n. The method should find the missing number in the array
     * and return it.
     *
     * For example, if the input array is [2, 3, 4, 5, 6], the output should be 1, which is the missing number.
     * If the input array is [1, 2, 4, 6, 3, 7, 8], the output should be 5, which is the missing number.
     *
     * Assume that the input array will always have at least one missing number.
     */

    public static int findMissingNumber(int[] arr) {
        // your code here
        Set<Integer> mySet = new HashSet<>();
        for (int i =0; i<arr.length; i++) {
            mySet.add(arr[i]);
        }

        for (int i =1; i<arr.length+2; i++) {
            if (mySet.add(i)) {
                System.out.println("adding "+i);
                return i;
            }
            if (!mySet.add(i)) {
                System.out.println("Not adding "+i);
            }
        }
        return -1;

    }


}
