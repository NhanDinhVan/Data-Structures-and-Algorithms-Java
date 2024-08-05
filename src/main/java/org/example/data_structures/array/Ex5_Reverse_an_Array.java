package org.example.data_structures.array;

import java.util.Arrays;

public class Ex5_Reverse_an_Array {
    public static int[] solution(int[] nums)
    {
        int n ;
        for(int i = 0, j = nums.length - 1 ; i < nums.length/2 ; i++){
           n = nums[j];
           nums[j--] = nums[i];
           nums[i] = n;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(
                Arrays.toString(solution(nums))
        );
    }
}
