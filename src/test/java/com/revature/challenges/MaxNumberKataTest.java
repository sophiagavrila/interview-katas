package com.revature.challenges;

import org.junit.jupiter.api.Test;

import static com.revature.challenges.MaxNumberKata.findMax;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberKataTest {

    @Test
    public void testFindMaxWithNonEmptyArray1() {
        int[] arr = {1, 2, 5, 3, 8};
        assertEquals(8, findMax(arr));
    }

    @Test
    public void testFindMaxWithNonEmptyArray2() {
        int[] arr = {10, 0, -2, 7, 3};
        assertEquals(10, findMax(arr));
    }

    @Test
    public void testFindMaxWithNonEmptyArray3() {
        int[] arr = {-5, -10, -3, -8};
        assertEquals(-3, findMax(arr));
    }

    @Test
    public void testFindMaxWithSArrayOfZero() {
        int[] arr = {0};
        assertEquals(0, findMax(arr));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        int[] arr = {};
        assertEquals(-1, findMax(arr));
    }


}