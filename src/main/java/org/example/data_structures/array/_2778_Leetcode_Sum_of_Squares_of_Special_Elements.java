package org.example.data_structures.array;

public class _2778_Leetcode_Sum_of_Squares_of_Special_Elements {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 1; i < n+1; i++)
            sum += (n % i == 0) ? nums[i-1]*nums[i-1] : 0;
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        _2778_Leetcode_Sum_of_Squares_of_Special_Elements test = new _2778_Leetcode_Sum_of_Squares_of_Special_Elements();
        System.out.println(test.sumOfSquares(nums));
    }
}
