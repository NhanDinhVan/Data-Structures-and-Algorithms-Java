package org.example.data_structures.String;

/**
 * _1629_Leetcode_Slowest_Key
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/19/2025    NhanDinhVan    Create
 */

public class _1629_Leetcode_Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = keysPressed.length();
        int slowest = releaseTimes[0];
        char c = keysPressed.charAt(0);

        for(int i = 1; i < n; i++){
            if((releaseTimes[i] - releaseTimes[i-1] > slowest) ||
                    releaseTimes[i] - releaseTimes[i-1] == slowest && keysPressed.charAt(i) > c){
                c = keysPressed.charAt(i);
                slowest = releaseTimes[i] - releaseTimes[i-1];
            }
        }

        return c;
    }
}
