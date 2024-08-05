package org.example.data_structures.array;

public class _28_Leetcode_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        int j = 0;
        int k = 0;
        for(int i = 0; i < haystack.length() ; i++)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                if(j == 0)
                    k = i;
                j++;
                if(j == needle.length())
                    return k;
            }
            else{
                if(j!=0)
                    i = k;
                j = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.print(strStr(haystack, needle));
    }
}
