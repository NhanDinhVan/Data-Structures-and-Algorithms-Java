package org.example.data_structures.array;

public class Ex4_Count_the_Occurrences_of_an_Element {
    public int solution(int[] nums, int target)
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target)
                count++;
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 2};
        int target = 2;
        Ex4_Count_the_Occurrences_of_an_Element test = new Ex4_Count_the_Occurrences_of_an_Element();
        System.out.println(test.solution(nums, target));
    }
}
