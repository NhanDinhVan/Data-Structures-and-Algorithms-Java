package org.example.data_structures.array;

/**
 * _2748_Leetcode_Number_of_Beautiful_Pairs
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/14/2025    NhanDinhVan    Create
 */

public class _2748_Leetcode_Number_of_Beautiful_Pairs {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(gcd(getFirst(nums[i]), nums[j]%10) == 1) count++;
            }
        }
        return count;
    }

    public static int getFirst(int num){
        while(num >= 10){
            num /= 10;
        }
        return num;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
