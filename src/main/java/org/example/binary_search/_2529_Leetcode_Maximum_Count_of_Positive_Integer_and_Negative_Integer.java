package org.example.binary_search;

public class _2529_Leetcode_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public int maximumCount(int[] nums) {
        int negative = findLargestNegative(nums);
        int positive = findSmallestPositive(nums);

        if(nums.length == 0 || (negative < 0 && positive < 0))
            return 0;
        if(nums.length == 1) return 1;
        if(negative < 0) return nums.length - positive;
        if(positive < 0) return negative+1;

        return Math.max(negative+1, nums.length-positive);
    }
    public int findSmallestPositive(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return (l < nums.length && nums[l] > 0) ? l : -1;
    }
    public int findLargestNegative(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int result = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < 0) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

}
