package org.example.data_structures.array;

public class _3264_Leetcode_Final_Array_State_After_K_Multiplication_Operations_I {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int minI = getMinNumIndex(nums);
            nums[minI] *= multiplier;
            k--;
        }
        return nums;
    }
    public int getMinNumIndex(int[] nums){
        int min = Integer.MAX_VALUE;
        int minI = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minI = i;
            }
        }
        return minI;
    }
}
