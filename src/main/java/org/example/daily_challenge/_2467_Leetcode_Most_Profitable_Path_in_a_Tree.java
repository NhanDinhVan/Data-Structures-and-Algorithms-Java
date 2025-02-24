package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _2467_Leetcode_Most_Profitable_Path_in_a_Tree
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/24/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/24/2025    NhanDinhVan    Create
 */

public class _2467_Leetcode_Most_Profitable_Path_in_a_Tree {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<Integer>[] tree = new ArrayList[n];

        for(int i = 0; i < n; i++) tree[i] = new ArrayList<>();

        for(int[] edge : edges){
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }

        int[] bobTime = new int[n];

        Arrays.fill(bobTime, Integer.MAX_VALUE);
        findBobPath(tree, bob, 0, -1, 0, bobTime);

        return dfsAlice(tree, 0, -1, 0, 0, bobTime, amount);
    }

    public boolean findBobPath(List<Integer>[] tree, int node, int target, int parent, int time, int[] bobTime){
        if (node == target) {
            bobTime[node] = time;
            return true;
        }

        for (int neighbor : tree[node]) {
            if (neighbor == parent) continue;  // Không return false ở đây

            if (findBobPath(tree, neighbor, target, node, time + 1, bobTime)) {
                bobTime[node] = time;
                return true;
            }
        }
        return false;
    }

    public int dfsAlice(List<Integer>[] tree, int node, int parent, int time, int profit, int[] bobTime, int[] amount){
        if (time < bobTime[node]) {
            profit += amount[node];  // Alice nhận toàn bộ số tiền
        } else if (time == bobTime[node]) {
            profit += amount[node] / 2;  // Chia tiền khi Bob đến cùng lúc
        } // Nếu Bob đến trước, Alice nhận 0

        if (tree[node].size() == 1 && node != 0) return profit;  // Nếu là lá, return ngay

        int maxProfit = Integer.MIN_VALUE;
        for (int neighbor : tree[node]) {
            if (neighbor == parent) continue;
            maxProfit = Math.max(maxProfit, dfsAlice(tree, neighbor, node, time + 1, profit, bobTime, amount));
        }
        return maxProfit;
    }
}
