package org.example.data_structures.array;

import java.util.Arrays;

public class Ex10_Longest_palindrome_substring {
    public static int solution(int[] nums)
    {
        int count = 1;
        for(int i = 1; i < nums.length; i++)
        {
//            if(check(nums, i , ))
        }
        return 0;
    }
    public static boolean check(int[] nums, int n, int m)
    {
        int size = m-n+1;
        int[] firstHalf = new int[size/2];
        int[] secondHalf = new int[size/2];
        for(int i = 0; i < size/2 ; i++){
            firstHalf[i] = nums[n++];
            secondHalf[i] = nums[m--];
        }
        System.out.println(
                Arrays.toString(firstHalf) +"\n"+
                        Arrays.toString(secondHalf)
        );
        return Arrays.equals(firstHalf, secondHalf);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};
        System.out.println(check(nums1, 1, 3)); // Đầu ra: true
    }
}
