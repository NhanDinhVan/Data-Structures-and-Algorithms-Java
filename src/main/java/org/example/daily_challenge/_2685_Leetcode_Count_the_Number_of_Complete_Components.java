package org.example.daily_challenge;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * _2685_Leetcode_Count_the_Number_of_Complete_Components
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/22/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/22/2025    NhanDinhVan    Create
 */

public class _2685_Leetcode_Count_the_Number_of_Complete_Components {
    public int countCompleteComponents(int n, int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int[] edge : edges) {
            adj.putIfAbsent(edge[0], new ArrayList<>());
            adj.get(edge[0]).add(edge[1]);

            adj.putIfAbsent(edge[1], new ArrayList<>());
            adj.get(edge[1]).add(edge[0]);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] result = dfs(i, adj, visited);
                int nodes = result[0];
                int edgesCount = result[1];

                if (edgesCount == nodes * (nodes - 1) / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public int[] dfs(int node, HashMap<Integer, ArrayList<Integer>> adj, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        int nodes = 0;
        int edgesCount = 0;

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            nodes++;

            if (adj.containsKey(cur)) {
                for (int neighbor : adj.get(cur)) {
                    edgesCount++;
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        stack.push(neighbor);
                    }
                }
            }
        }

        return new int[]{nodes, edgesCount / 2};
    }
}
