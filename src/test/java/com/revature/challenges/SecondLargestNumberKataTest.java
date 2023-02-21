package com.revature.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.revature.challenges.SecondLargestNumberKata.findSecondLargest;
import static org.junit.jupiter.api.Assertions.*;

class SecondLargestNumberKataTest {

    @Test
    public void testFindSecondLargestReturnsCorrectResult1() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSecondLargest = 4;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsCorrectResult2() {
        List<Integer> nums = Arrays.asList(11, 22, 33, 44, 55, 66);
        int expectedSecondLargest = 55;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsCorrectResult3() {
        List<Integer> nums = Arrays.asList(7, 21, 34, 15, 10, 0);
        int expectedSecondLargest = 21;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsCorrectResultWithNegativeNumbers() {
        List<Integer> nums = Arrays.asList(-3, -1, -2, 0, 2, 1);
        int expectedSecondLargest = 1;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsNegativeOneForEmptyList() {
        List<Integer> nums = Arrays.asList();
        int expectedSecondLargest = -1;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsNegativeOneForSingleElementList() {
        List<Integer> nums = Arrays.asList(5);
        int expectedSecondLargest = -1;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

    @Test
    public void testFindSecondLargestReturnsCorrectResultForListWithDuplicates() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        int expectedSecondLargest = 4;
        int actualSecondLargest = findSecondLargest(nums);
        assertEquals(expectedSecondLargest, actualSecondLargest);
    }

}