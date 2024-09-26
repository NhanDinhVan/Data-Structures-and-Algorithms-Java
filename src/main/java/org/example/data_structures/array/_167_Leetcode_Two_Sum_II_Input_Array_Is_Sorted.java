package org.example.data_structures.array;

import java.util.HashMap;

public class _167_Leetcode_Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
//        for(int i = 0 ; i < numbers.length - 1; i++){
//            for(int j = i+1; j < numbers.length ; j++){
//                if(numbers[i] + numbers[j] == target)
//                    return new int[] {i + 1, j + 1};
//            }
//        }
//        return null;

        int l = 0;
        int r = numbers.length - 1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum < target)
                l++;
            else if(sum > target)
                r--;
            else
                break;
        }
        return new int[] {l+1, r+1};
    }
}
