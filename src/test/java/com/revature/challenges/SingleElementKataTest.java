package com.revature.challenges;

import org.junit.jupiter.api.Test;

import static com.revature.challenges.SingleElementKata.singleNonDuplicate;
import static org.junit.jupiter.api.Assertions.*;

class SingleElementKataTest {

    @Test
    public void testFindSingleReturnsCorrectResult1() {
        int[] nums = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        int expectedSingle = 1;
        int actualSingle = singleNonDuplicate(nums);
        assertEquals(expectedSingle, actualSingle);
    }

    @Test
    public void testFindSingleReturnsCorrectResult2() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int expectedSingle = 2;
        int actualSingle = singleNonDuplicate(nums);
        assertEquals(expectedSingle, actualSingle);
    }

    @Test
    public void testFindSingleReturnsCorrectResult3() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};
        int expectedSingle = 5;
        int actualSingle = singleNonDuplicate(nums);
        assertEquals(expectedSingle, actualSingle);
    }

}