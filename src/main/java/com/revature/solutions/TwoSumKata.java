package com.revature.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumKata {

    /**
     * Given an array of integers nums and an integer target, return indices of the two
     * numbers that add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not
     * use the same element twice.
     *
     * For example: if nums = {2, 7, 11, 15} and target = 9, then return {0, 1}.
     * If nums = {3, 2, 4}, target = 6, then return {1, 2}.
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
