package org.example.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _17_Leetcode_Letter_Combinations_of_a_Phone_Number {
    List<String> ans = new ArrayList<>();
    HashMap<Character, List<Character>> dict = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        dict.put('2', List.of('a', 'b', 'c'));
        dict.put('3', List.of('d', 'e', 'f'));
        dict.put('4', List.of('g', 'h', 'i'));
        dict.put('5', List.of('j', 'k', 'l'));
        dict.put('6', List.of('m', 'n', 'o'));
        dict.put('7', List.of('p', 'q', 'r', 's'));
        dict.put('8', List.of('t', 'u', 'v'));
        dict.put('9', List.of('w', 'x', 'y', 'z'));

        backtrack(0, digits, new StringBuilder());

        return ans;
    }
    public void backtrack(int index, String digits, StringBuilder item){
        if(item.length() == digits.length()){
            ans.add(item.toString());
            return;
        }
        char s = digits.charAt(index);
        List<Character> letters = dict.get(s);
        for(char letter : letters){
            item.append(letter);
            backtrack(index+1, digits, item);
            item.deleteCharAt(item.length()-1);
        }
    }
}
