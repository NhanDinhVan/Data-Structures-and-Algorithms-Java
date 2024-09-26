package org.example.data_structures.array;

public class _167_Leetcode_Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0 ; i < numbers.length - 1; i++){
            for(int j = i+1; j < numbers.length ; j++){
                if(numbers[i] + numbers[j] == target)
                    return new int[] {i + 1, j + 1};
            }
        }
        return null;
    }
}
