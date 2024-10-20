package org.example.dynamic_programing;

import java.util.LinkedList;
import java.util.Queue;

/**
 * _392_Leetcode_Is_Subsequence
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _392_Leetcode_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        if(s == null)
            return true;
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            queue.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            if(queue.isEmpty())
                return true;
            if(t.charAt(i) == queue.peek())
                queue.poll();
        }
        return queue.isEmpty();
    }
}
