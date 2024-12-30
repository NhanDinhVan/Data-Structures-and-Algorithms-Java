package org.example.data_structures.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * _2293_Leetcode_Min_Max_Game
 * <p>
 * Version 1.0
 * <p>
 * Date:  12/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 12/30/2024    NhanDinhVan    Create
 */

public class _2293_Leetcode_Min_Max_Game {
    public int minMaxGame(int[] nums) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        for(int i : nums)
//            queue.add(i);
//
//        while(queue.size() > 1){
//            int size = queue.size();
//            int mode = 0;
//
//            for(int i = 0; i < size/2; i++){
//                int n1 = queue.poll();
//                int n2 = queue.poll();
//
//                if(mode==0){
//                    queue.add(Math.min(n1, n2));
//                    mode = 1;
//                }else{
//                    queue.add(Math.max(n1, n2));
//                    mode = 0;
//                }
//            }
//        }
//        return queue.poll();

        int n = nums.length;
        int[] newNums = new int[n / 2];
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < newNums.length; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(newNums);
    }
}
