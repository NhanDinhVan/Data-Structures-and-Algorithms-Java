package org.example.two_pointer;

/**
 * _2302_Leetcode_Count_Subarrays_With_Score_Less_Than_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/22/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/22/2024    NhanDinhVan    Create
 */

public class _2302_Leetcode_Count_Subarrays_With_Score_Less_Than_K {
    public long countSubarrays(int[] nums, long k) {
//        int n = nums.length;
//        long[] prefixSum = new long[n+1];
//        long count = 0;
//        for(int i = 0; i < n; i++){
//            prefixSum[i + 1] = prefixSum[i] + nums[i];
//        }
//        for(int start = 0; start < n; start++){
//            int low = start;
//            int high = n;
//            while (low < high){
//                int mid = low + (high - low)/2;
//                long sum = prefixSum[mid + 1] - prefixSum[start];
//                if(sum * (mid - start + 1) < k){
//                    low = mid + 1;
//                }else{
//                    high = mid;
//                }
//            }
//            count += low - start;
//        }
//        return count;
        int l = 0, r = 0;
        long count = 0, sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum * (r - l + 1) >= k) {
                sum -= nums[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}
