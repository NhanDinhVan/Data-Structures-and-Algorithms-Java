package org.example.data_structures.stack_queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * _71_Leetcode_Simplify_Path
 * <p>
 * Version 1.0
 * <p>
 * Date:  1/10/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 1/10/2025    NhanDinhVan    Create
 */

public class _71_Leetcode_Simplify_Path {
    public String simplifyPath(String path) {
        Stack stack = new Stack<>();
        String[] component = path.split("/");

        for(String s : component){
            if(s.equals("") || s.equals(".")) continue;

            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s);

            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.insert(0, "/"+ stack.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
