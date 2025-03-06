package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * _1942_Leetcode_The_Number_of_the_Smallest_Unoccupied_Chair
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/6/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/6/2025    NhanDinhVan    Create
 */

public class _1942_Leetcode_The_Number_of_the_Smallest_Unoccupied_Chair {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[][] sortedTimes = new int[n][3];

        for(int i = 0; i < n; i++){
            sortedTimes[i][0] = times[i][0];
            sortedTimes[i][1] = times[i][1];
            sortedTimes[i][2] = i ;
        }

        Arrays.sort(sortedTimes, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> availables = new PriorityQueue<>();
        PriorityQueue<int[]> occupied = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        int next = 0;

        for(int[] friend : sortedTimes){
            int arrival = friend[0];
            int leaving  = friend[1];
            int index = friend[2];

            while(!occupied.isEmpty() && occupied.peek()[0] <= arrival){
                availables.offer(occupied.poll()[1]);
            }

            int chair;

            if(!availables.isEmpty()){
                chair = availables.poll();
            }else{
                chair = next++;
            }

            occupied.offer(new int[] {leaving, chair});

            if(index == targetFriend){
                return chair;
            }

        }

        return -1;
    }
}
