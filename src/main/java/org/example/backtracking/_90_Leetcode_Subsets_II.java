package org.example.backtracking;

import java.util.*;

/**
 * _90_Leetcode_Subsets_II
 * <p>
 * Version 1.0
 * <p>
 * Date:  11/6/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 11/6/2024    NhanDinhVan    Create
 */

public class _90_Leetcode_Subsets_II {
// HashSet, Backtracking, Decision Tree:
//
//    List<List<Integer>> ans = new ArrayList<>();
//    HashSet<List<Integer>> hset = new HashSet<>();
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        backtrack( 0, nums, new ArrayList<>());
//        return ans;
//    }
//
//    public void backtrack(int start, int[] nums, List<Integer> list){
//        if(start == nums.length){
//            if(!hset.contains(list)){
//                ans.add(new ArrayList<>(list));
//            }
//            hset.add(new ArrayList<>(list));
//            return;
//        }
//
//        list.add(nums[start]);
//        backtrack( start + 1, nums, list);
//        list.remove(list.size() - 1);
//        backtrack( start+1, nums, list);
//    }
//
// Not using HashSet

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack( 0, nums, new ArrayList<>());
        return ans;
    }

    public void backtrack(int start, int[] nums, List<Integer> list){
        if(start == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[start]);
        backtrack( start + 1, nums, list);

        while(start + 1 < nums.length && nums[start + 1] == nums[start])
            start++;
        list.remove(list.size() - 1);
        backtrack( start+1, nums, list);
    }
}
