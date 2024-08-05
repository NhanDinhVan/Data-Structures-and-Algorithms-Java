package org.example.data_structures.array;

public class _1295_LeetCode_Find_Number_with_even_Number_Of_Digits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(countingDigits(num)%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public int countingDigits(int n)
    {
        int count = 0;
        while (n != 0)
        {
            n = n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        _1295_LeetCode_Find_Number_with_even_Number_Of_Digits test = new _1295_LeetCode_Find_Number_with_even_Number_Of_Digits();
        int[] nums = {133,2,3,4,5,62,73};
        int result = test.findNumbers(nums);
        System.out.println(result);
    }
}
