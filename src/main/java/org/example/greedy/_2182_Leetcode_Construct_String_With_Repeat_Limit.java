package org.example.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _2182_Leetcode_Construct_String_With_Repeat_Limit {
    public String repeatLimitedString(String s, int repeatLimit) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder ans = new StringBuilder();

        int count = 1;
        int pointer = chars.length-1;

        for(int i = chars.length-1; i >= 0; i--){
            if(ans.length() > 0 && ans.charAt(ans.length() - 1) == chars[i]){
                if(count < repeatLimit) {
                    ans.append(chars[i]);
                    count++;
                }else{
                    while(pointer >= 0 && (chars[pointer] == chars[i] || pointer > i))
                        pointer--;
                    if(pointer < 0) break;
                    ans.append(chars[pointer]);
                    char tmp = chars[i];
                    chars[i] = chars[pointer];
                    chars[pointer] = tmp;
                    count = 1;
                }
            }else{
                ans.append(chars[i]);
                count = 1;
            }
        }
        return ans.toString();
    }
}
