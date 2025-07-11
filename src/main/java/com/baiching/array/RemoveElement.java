package com.baiching.array;


public class RemoveElement {
    public int removeElements (int[] nums, int val) {
        int k = 0;
        for (int num: nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}
