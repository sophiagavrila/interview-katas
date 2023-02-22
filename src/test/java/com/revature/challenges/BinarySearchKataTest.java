package com.revature.challenges;

import org.junit.jupiter.api.Test;

import static com.revature.challenges.BinarySearchKata.chop;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchKataTest {

    @Test
    public void testChopReturnsCorrectIndex1() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int actualIndex = chop(target, arr);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testChopReturnsCorrectIndex2() {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 11};
        int target = 9;
        int expectedIndex = 5;
        int actualIndex = chop(target, arr);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testChopReturnsCorrectIndex3() {
        int[] arr = {4, 5, 6};
        int target = 5;
        int expectedIndex = 1;
        int actualIndex = chop(target, arr);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testChopReturnsNegativeOneForMissingTarget() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int actualIndex = chop(target, arr);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testChopReturnsCorrectIndexForLastElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        int expectedIndex = 4;
        int actualIndex = chop(target, arr);
        assertEquals(expectedIndex, actualIndex);
    }

}