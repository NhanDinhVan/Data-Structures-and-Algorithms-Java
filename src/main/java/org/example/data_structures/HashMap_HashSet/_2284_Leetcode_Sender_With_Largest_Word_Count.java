package org.example.data_structures.HashMap_HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * _2284_Leetcode_Sender_With_Largest_Word_Count
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/2/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/2/24   NhanDinhVan    Create
 */
public class _2284_Leetcode_Sender_With_Largest_Word_Count {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> hmap = new HashMap<>();
        String maxSender = "";

        for (int i = 0; i < messages.length; i++){
            String[] a = messages[i].split(" ");
            hmap.put(senders[i], hmap.getOrDefault(senders[i], 0)+ a.length);
        }

        for(Map.Entry<String, Integer> i : hmap.entrySet()){
            if(i.getValue() > hmap.getOrDefault(maxSender, 0)){
                maxSender = i.getKey();
            }else if(i.getValue() == hmap.getOrDefault(maxSender,0)){
                maxSender = (maxSender.compareTo(i.getKey()) > 0) ? maxSender : i.getKey();
            }
        }
        return maxSender;
    }
}
