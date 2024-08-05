package org.example.data_structures.String;

import java.util.LinkedList;
import java.util.Queue;

public class _38_Leetcode_Count_and_Say {
    public static String countAndSay(int n) {
//        Queue<Character> temp = new LinkedList<>();
        String result = "1";
        if(n == 1)
            return result;
        while(n > 1)
        {
            int count = 1;
            StringBuilder temp = new StringBuilder();
            for(int i = 1 ; i < result.length() ; i++)
            {
                if(result.charAt(i) == result.charAt(i-1))
                {
                    count++;
                }else
                {
                    temp.append(count).append(result.charAt(i-1));
                    count = 1;
                }
            }
            temp.append(count).append(result.charAt(result.length() - 1));
            result = temp.toString();
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
