package com.revature.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.revature.solutions.TwoSumKata.twoSum;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumKataTest {

    @Test
    public void testTwoSumWithValidSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = twoSum(nums, target);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSumWithNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 8;
        int[] expected = null;
        int[] actual = twoSum(nums, target);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSumWithDuplicateNumbers() {
        int[] nums = {3, 2, 4, 3};
        int target = 6;
        int[] expected = {0, 3};
        int[] actual = twoSum(nums, target);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        int[] actual = twoSum(nums, target);
        assertTrue(Arrays.equals(expected, actual));
    }


}