package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * _802_Leetcode_Find_Eventual_Safe_States
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/24/2025    NhanDinhVan    Create
 */

public class _802_Leetcode_Find_Eventual_Safe_States {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int m = graph.length;
        int[] color = new int[m];
        List<Integer> results = new ArrayList<>();

        for(int i = 0; i < m; i++){
            if(DFS(graph, i, color)){
                results.add(i);
            }
        }

        return results;
    }

    public boolean DFS(int[][] graph, int node, int[] color){
        if(color[node] > 0) return color[node] == 2;

        color[node] = 1;
        for(int neighbor : graph[node]){
            if(color[neighbor] == 2) continue;
            if(color[neighbor] == 1 || !DFS(graph, neighbor, color)){
                return false;
            }
        }
        color[node] = 2;
        return true;
    }
}
