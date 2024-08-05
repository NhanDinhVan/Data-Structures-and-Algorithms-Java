package org.example.data_structures.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EX3_Insert_into_Array {
    public int[] solution(int[] nums, int target, int index)
    {
        int n = nums.length;
        int[] newArray = new int[n+1];
        index = (index < 0) ? 0 : (index > n) ? n : index;

        for(int i = 0 , j = 0; i < n+1 ; i++)
            {
                if(index == i)
                    newArray[i] = target;
                else
                    newArray[i] = nums[j++];
            }
        return newArray;
        }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int index = -1;
        EX3_Insert_into_Array test = new EX3_Insert_into_Array();
        System.out.println(
                Arrays.toString(test.solution(nums, target, index))
        );
    }
}
