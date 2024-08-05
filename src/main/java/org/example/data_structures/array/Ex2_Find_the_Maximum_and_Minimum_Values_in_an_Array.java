package org.example.data_structures.array;

public class Ex2_Find_the_Maximum_and_Minimum_Values_in_an_Array {
    public static void solution(int[] nums)
    {
        int max = nums[0],min = nums[0];
        for(int i = 0; i < nums.length; i++){
           if(nums[i]>max)
               max = nums[i];
           if(nums[i]<min)
               min = nums[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public static void main(String[] args) {
        int[] nums = {2,3,7,4,1,9,0};
        solution(nums);
    }
}
