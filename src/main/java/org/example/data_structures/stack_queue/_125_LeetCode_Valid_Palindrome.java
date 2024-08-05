package org.example.data_structures.stack_queue;

import java.util.Stack;

public class _125_LeetCode_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
//        char[] charArr = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        char n;
        boolean result = true;
        for(int i = 0 ; i < s.length() ; i++)
        {
            n = s.charAt(i);
            if(n >= 'a' && n <= 'z' || n>='0' && n <= '9')
            {
                stack.push(n);
//                charArr[i] = n;
            }else if(n >= 'A' && n <= 'Z')
            {
                stack.push( (char) (n + 'a' - 'A'));
//                charArr[i] = (char) (n + 'a' - 'A');
            }
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            n = s.charAt(i);
            if(n >= 'a' && n <= 'z'|| n>='0' && n <= '9')
            {
                result = (n == stack.pop()) ? true : false;
            }else if(n >= 'A' && n <= 'Z')
            {
//                charArr[i] = (char) (n + 'a' - 'A');
                result = ((char) (n + 'a' - 'A') == stack.pop()) ? true : false;
            }
            if(!result)
                return false;
        }
//        System.out.println(
//                Arrays.toString(charArr)
//        );
        return true;
    }

    public static void main(String[] args) {
        String s  = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
