package org.example.math;

/**
 * _1837_Leetcode_Sum_of_Digits_in_Base_K
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/11/2025    NhanDinhVan    Create
 */

public class _1837_Leetcode_Sum_of_Digits_in_Base_K {
    public int sumBase(int n, int k) {
        int num = getBaseK(n, k);
        System.out.println(num);
        int ans = 0;
        while(num > 0){
            ans = ans + num%10;
            num /= 10;
        }
        return ans;
    }
    public static int getBaseK(int n, int k){
        int ans = 0;
        while(n > 0){
            ans = ans*10 + n%k;
            n /= k;
        }
        return ans;
    }
}
