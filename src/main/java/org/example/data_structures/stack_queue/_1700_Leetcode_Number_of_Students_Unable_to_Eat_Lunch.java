package org.example.data_structures.stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * _1700_Leetcode_Number_of_Students_Unable_to_Eat_Lunch
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/14/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/14/2024    NhanDinhVan    Create
 */

public class _1700_Leetcode_Number_of_Students_Unable_to_Eat_Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
//        int circleCount = 0;
//        int squareCount = 0;
//
//        for(int i = 0; i < students.length; i++){
//            if(students[i] == 1){
//                squareCount++;
//            }else{
//                circleCount++;
//            }
//        }
//        for(int i = 0; i < sandwiches.length; i++){
//            if(sandwiches[i] == 0 && circleCount == 0)
//                return squareCount;
//            if(sandwiches[i] == 1 && squareCount == 0)
//                return circleCount;
//            if(sandwiches[i] == 0)
//                circleCount--;
//            else
//                squareCount--;
//        }
//        return 0;
        Queue<Integer> studentQueue = new ArrayDeque<>();
        Queue<Integer> sandwichQueue = new ArrayDeque<>();
        int lastServed = 0;
        for(int i = 0; i < students.length; i++){
            studentQueue.add(students[i]);
            sandwichQueue.add(sandwiches[i]);
        }
        while(studentQueue.size() > 0 && lastServed < studentQueue.size()){
            if(sandwichQueue.peek() == studentQueue.peek()){
                sandwichQueue.poll();
                studentQueue.poll();
                lastServed = 0;
            }else {
                studentQueue.offer(studentQueue.poll());
                lastServed++;
            }
        }
        return studentQueue.size();
    }
}
