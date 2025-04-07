package org.example.data_structures.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * _933_Leetcode_Number_of_Recent_Calls
 * <p>
 * Version 1.0
 * <p>
 * Date:  4/7/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 4/7/2025    NhanDinhVan    Create
 */

public class _933_Leetcode_Number_of_Recent_Calls {
    class RecentCounter {
        Queue<Integer> q;
        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.add(t);

            while(t - q.peek() > 3000){
                q.poll();
            }
            return q.size();
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
