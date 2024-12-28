package org.example.binary_search;

/**
 * _374_Leetcode_Guess_Number_Higher_or_Lower
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/29/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/29/2024    NhanDinhVan    Create
 */

public class _374_Leetcode_Guess_Number_Higher_or_Lower {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high-low)/2;
            int g = guess(mid);
            if(g == 0) return mid;
            if(g == -1) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    private int guess(int num) {
        int secret = 6; // Example secret number
        if (num == secret) return 0;
        if (num > secret) return -1;
        return 1;
    }
}
