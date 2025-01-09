package org.example.data_structures.HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * _380_Leetcode_Insert_Delete_GetRandom_O_1
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

public class _380_Leetcode_Insert_Delete_GetRandom_O_1 {

    class RandomizedSet {
        List<Integer> list;
        HashMap<Integer, Integer> mapper;
        Random rand;
        public RandomizedSet() {
            list = new ArrayList<>();
            mapper = new HashMap<>();
            rand = new Random();

        }

        public boolean checkExist(int num){
            return mapper.containsKey(num);
        }
        public boolean insert(int val) {
            if(checkExist(val)) return false;

            list.add(val);
            mapper.put(val, list.size() - 1);

            return true;
        }

        public boolean remove(int val) {
            if(!checkExist(val)) return false;

            int idx = mapper.get(val);

            list.set(idx, list.get(list.size() - 1));
            mapper.put(list.get(idx), idx);
            list.remove(list.size()-1);
            mapper.remove(val);

            return true;
        }

        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }
}
