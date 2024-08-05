package org.example.data_structures.array;

import java.util.HashSet;
import java.util.Set;

public class _217_Leetcode_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        _217_Leetcode_Contains_Duplicate test = new _217_Leetcode_Contains_Duplicate();

        int[] nums = {1,2,3,4,5,6,7,8,9,10,1};
        if (test.containsDuplicate(nums))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
