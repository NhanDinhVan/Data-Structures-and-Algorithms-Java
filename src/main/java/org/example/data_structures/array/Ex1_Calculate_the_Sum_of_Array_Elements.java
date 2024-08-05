package org.example.data_structures.array;

public class Ex1_Calculate_the_Sum_of_Array_Elements {
    public int solution(int[] nums)
    {
        int sum = 0;
        for(int n : nums)
            sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Ex1_Calculate_the_Sum_of_Array_Elements test = new Ex1_Calculate_the_Sum_of_Array_Elements();
        int[] nums = {2,5,3,2,4,6};
        System.out.println(test.solution(nums));
    }
}
