package org.example.daily_challenge;

import java.awt.*;
import java.util.*;

/**
 * _1976_Leetcode_Number_of_Ways_to_Arrive_at_Destination
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/23/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/23/2025    NhanDinhVan    Create
 */

public class _1976_Leetcode_Number_of_Ways_to_Arrive_at_Destination {
    public int countPaths(int n, int[][] roads) {
        Map<Integer, ArrayList<int[]>> adjList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] road : roads) {
            adjList.get(road[0]).add(new int[]{road[1], road[2]});
            adjList.get(road[1]).add(new int[]{road[0], road[2]});
        }

        return dijkstra(n, adjList);
    }

    private int dijkstra(int n, Map<Integer, ArrayList<int[]>> adjList) {
        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.offer(new long[]{0, 0}); // {node, distance}

        int MOD = (int) (1e9 + 7);

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            int node = (int) curr[0];
            long d = curr[1];

            if (d > dist[node]) continue;

            for (int[] neighbor : adjList.get(node)) {
                int nextNode = neighbor[0];
                long weight = neighbor[1];
                long newDist = d + weight;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    ways[nextNode] = ways[node];
                    pq.offer(new long[]{nextNode, newDist});
                } else if (newDist == dist[nextNode]) {
                    ways[nextNode] = (ways[nextNode] + ways[node]) % MOD;
                }
            }
        }
        return ways[n - 1];
    }
}
