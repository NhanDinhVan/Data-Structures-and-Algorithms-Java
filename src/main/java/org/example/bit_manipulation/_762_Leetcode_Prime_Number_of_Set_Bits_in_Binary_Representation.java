package org.example.bit_manipulation;

/**
 * _762_Leetcode_Prime_Number_of_Set_Bits_in_Binary_Representation
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/4/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/4/2025    NhanDinhVan    Create
 */

public class _762_Leetcode_Prime_Number_of_Set_Bits_in_Binary_Representation {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left; i <= right; i++){
            int n = i;
            int count = 0;
            while(n > 0){
                count += (n & 1);
                n >>= 1;
            }
            if(isPrime(count)) ans++;
        }
        return ans;
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i+= 2){
            if(n % i == 0) return false;
        }

        return true;
    }
}
