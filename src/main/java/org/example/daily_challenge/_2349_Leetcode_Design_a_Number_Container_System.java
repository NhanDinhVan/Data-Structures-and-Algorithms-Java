package org.example.daily_challenge;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * _2349_Leetcode_Design_a_Number_Container_System
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/8/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/8/2025    NhanDinhVan    Create
 */

public class _2349_Leetcode_Design_a_Number_Container_System {
    private HashMap<Integer, Integer> container;
    private HashMap<Integer, TreeSet<Integer>> mapper;

    public _2349_Leetcode_Design_a_Number_Container_System() {
        container = new HashMap<>();
        mapper = new HashMap<>();
    }

    public void change(int index, int number) {
        if (container.containsKey(index)) {
            int oldNumber = container.get(index);

            // Xóa index cũ khỏi mapper nếu cần
            if (mapper.containsKey(oldNumber)) {
                mapper.get(oldNumber).remove(index);
                if (mapper.get(oldNumber).isEmpty()) {
                    mapper.remove(oldNumber);
                }
            }
        }

        container.put(index, number);

        // Thêm index vào mapper
        mapper.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return mapper.containsKey(number) ? mapper.get(number).first() : -1;
    }
}
