package org.example.data_structures.array;

import java.util.Arrays;

public class Ex7_Check_if_Array_is_Palindromic {
    public static boolean solution(int[] nums)
    {
        int n = nums.length;
        int[] firstHalf = new int[n/2], secondHalf = new int[n/2];
        for(int i = 0, j = n - 1; i < n/2 ; i++, j--){
            firstHalf[i] = nums[i];
            secondHalf[i] = nums[j];
        }
        System.out.println(
                Arrays.toString(firstHalf) +"\n"+
                Arrays.toString(secondHalf)
        );
            return Arrays.equals(firstHalf, secondHalf);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1};
        if(solution(nums))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
