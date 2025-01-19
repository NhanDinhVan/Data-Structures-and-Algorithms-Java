package org.example.data_structures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * _2231_Leetcode_Largest_Number_After_Digit_Swaps_by_Parity
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/19/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/19/2025    NhanDinhVan    Create
 */

public class _2231_Leetcode_Largest_Number_After_Digit_Swaps_by_Parity {
    public int largestInteger(int num) {
        PriorityQueue<Integer> first = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> second = new PriorityQueue<>(Collections.reverseOrder());

        while(num > 0){
            first.add(num%10);
            num /= 10;
            if(num > 0){
                second.add(num%10);
                num/=10;
            }
        }
        if(first.size() % 2 == 0){
            while (!first.isEmpty() && !second.isEmpty()){
                if(!first.isEmpty()) num = num*10 + first.poll();
                if(!second.isEmpty()) num = num*10 + second.poll();
            }
        }else{
            while (!first.isEmpty() && !second.isEmpty()) {
                if (!second.isEmpty()) num = num * 10 + second.poll();
                if (!first.isEmpty()) num = num * 10 + first.poll();
            }
        }
        return num;
    }
}
