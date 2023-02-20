package com.revature.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumKata {

    /**
     * Given an array of integers nums and an integer target, return indices of the two
     * numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not
     * use the same element twice.
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0;  i < nums.length ; i++) {
            map.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            int numToFind = target - nums[i];
            if (map.get(numToFind) != null && map.get(numToFind) != i)  {
                return new int[] {i, map.get(numToFind)};
            }
        }

        return null;
    }

}
