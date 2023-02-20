package com.revature.challenges;

import org.junit.jupiter.api.Test;

import static com.revature.challenges.ArtihmeticArrayKata.findMissingNumber;
import static org.junit.jupiter.api.Assertions.*;

class ArtihmeticArrayKataTest {

    @Test
    public void testFindMissingNumberUnordered1() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        assertEquals(5, findMissingNumber(arr));
    }

    @Test
    public void testFindMissingNumberUnordered2() {
        int[] arr = {1, 2, 4, 6, 3, 7, 10, 8, 5};
        assertEquals(9, findMissingNumber(arr));
    }

    @Test
    public void testFindMissingNumberOrdered1() {

        int[] arr = {1, 3, 4, 5, 6};
        assertEquals(2, findMissingNumber(arr));
    }

    @Test
    public void testFindMissingNumberOrdered2() {

        int[] arr = {2, 3, 4, 5, 6};
        assertEquals(1, findMissingNumber(arr));
    }

}