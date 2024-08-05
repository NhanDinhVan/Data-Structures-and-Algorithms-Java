package org.example.data_structures.array;

import java.util.Arrays;

public class Ex6_Remove_Duplicate_Elements {
    public static int[] solution(int[] nums)
    {
        int cur = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[cur])
                nums[++cur] = nums[i];
        }

        for(int  i = nums.length -1; i > cur; i--)
            nums[i] = -1;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3,4};
        System.out.println(
                Arrays.toString(
                        solution(nums)
                )
        );
    }
}
