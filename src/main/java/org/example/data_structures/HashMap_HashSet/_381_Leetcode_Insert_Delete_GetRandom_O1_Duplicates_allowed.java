package org.example.data_structures.HashMap_HashSet;

import javafx.util.Pair;

import javax.swing.*;
import java.util.*;

/**
 * _381_Leetcode_Insert_Delete_GetRandom_O1_Duplicates_allowed
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/9/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/9/2025    NhanDinhVan    Create
 */

public class _381_Leetcode_Insert_Delete_GetRandom_O1_Duplicates_allowed {
    class RandomizedCollection {
        List<Integer> list;
        HashMap<Integer, Set<Integer>> mapper;
        Random rand;
        public RandomizedCollection() {
            list = new ArrayList<>();
            mapper = new HashMap<>();
            rand = new Random();
        }

        public boolean checkExist(int val){
            return mapper.containsKey(val);
        }

        public boolean insert(int val) {
            boolean check = checkExist(val);

            mapper.putIfAbsent(val, new HashSet<>());
            mapper.get(val).add(list.size());
            list.add(val);

            return !check;
        }

        public boolean remove(int val) {
            if(!checkExist(val)) return false;

            int removeIdx = mapper.get(val).iterator().next();
            mapper.get(val).remove(removeIdx);

            if (removeIdx < list.size() - 1) {
                int lastVal = list.get(list.size() - 1);
                list.set(removeIdx, lastVal);

                mapper.get(lastVal).remove(list.size() - 1);
                mapper.get(lastVal).add(removeIdx);
            }

            list.remove(list.size() - 1);

            if (mapper.get(val).isEmpty()) {
                mapper.remove(val);
            }

            return true;
        }

        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }
}
