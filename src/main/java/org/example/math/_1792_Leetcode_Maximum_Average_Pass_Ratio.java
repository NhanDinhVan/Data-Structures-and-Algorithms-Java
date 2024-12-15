package org.example.math;

import java.util.PriorityQueue;

public class _1792_Leetcode_Maximum_Average_Pass_Ratio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
                Double.compare(delta(b), delta(a)));

        for(int[] i : classes){
            pq.offer(i);
        }
        for(int i = 0; i < extraStudents; i++){
            int[] top = pq.poll();
            top[0]++; top[1]++;
            pq.offer(top);
        }
        while(!pq.isEmpty()){
            int[] i = pq.poll();
            sum += (double) i[0]/i[1];
        }
        return sum/classes.length;
    }
    public double delta(int[] cl){
        return (double) (cl[0] + 1) / (cl[1] + 1) - (double) cl[0] / cl[1];
    }
}
