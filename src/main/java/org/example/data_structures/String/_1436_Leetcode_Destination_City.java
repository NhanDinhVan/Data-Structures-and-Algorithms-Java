package org.example.data_structures.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _1436_Leetcode_Destination_City
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

public class _1436_Leetcode_Destination_City {
    public String destCity(List<List<String>> paths) {
        HashMap<String, List<String>> dict = new HashMap<>();

        for(List<String> list : paths){
            dict.putIfAbsent(list.get(0), new ArrayList<>());
            dict.putIfAbsent(list.get(1), new ArrayList<>());
            dict.get(list.get(0)).add(list.get(1));
        }

        for(Map.Entry<String, List<String>> entry : dict.entrySet()){
            if(entry.getValue().isEmpty()) return entry.getKey();
        }

        return "";
    }
}
