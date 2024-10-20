package org.example.contests.weekly_contest_420;

import java.util.ArrayList;
import java.util.List;

/**
 * _Q1_Find_the_Sequence_of_Strings_Appeared_on_the_Screen
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/20/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/20/2024    NhanDinhVan    Create
 */

public class _Q1_Find_the_Sequence_of_Strings_Appeared_on_the_Screen {
    public List<String> stringSequence(String target) {
        StringBuilder s = new StringBuilder();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < target.length(); i++){
            for(char c = 'a'; c <= 'z'; c++){
                result.add(s.toString()+c);
                if(c == target.charAt(i)){
                    s.append(c);
                    break;
                }
            }
        }
        return result;
    }
}
