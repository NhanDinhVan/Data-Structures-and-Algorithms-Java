package org.example.binary_search;

public class _2540_Leetcode_Minimum_Common_Value {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i : nums1){
            int ans = binarySearch(i,nums2);
            if(ans!=-1) return i;
        }
        return -1;
    }
    public int binarySearch(int n, int[] nums){
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == n) {
                return mid;
            }
            if(n < nums[mid]){
                r = mid - 1;
            }else if(n > nums[mid]){
                l = mid + 1;
            }
        }
        return -1;
    }
}
