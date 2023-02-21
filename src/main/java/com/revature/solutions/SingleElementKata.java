package com.revature.solutions;

public class SingleElementKata {

    /**
     * You are given a sorted array consisting of only integers where every element appears exactly twice,
     * except for one element which appears exactly once.
     *
     * Return the single element that appears only once.
     *
     * For Example: if nums = [1,1,2,3,3,4,4,8,8], return 2.
     * If nums = [3,3,7,7,10,11,11], return 10.
     */
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (mid % 2 == 1) {
                // make sure mid is an even index
                mid--;
            }

            if (nums[mid] == nums[mid+1]) {
                // single element is to the right of mid
                left = mid + 2;
            } else {
                // single element is to the left of mid
                right = mid;
            }
        }

        // single element is at left pointer
        return nums[left];
    }


}
