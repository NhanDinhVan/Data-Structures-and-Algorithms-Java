package org.example.daily_challenge;

import java.util.Stack;

/**
 * _1352_Leetcode_Product_of_the_Last_K_Numbers
 * <p>
 * Version 1.0
 * <p>
 * Date:  2/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 2/14/2025    NhanDinhVan    Create
 */

public class _1352_Leetcode_Product_of_the_Last_K_Numbers {
    class ProductOfNumbers {
        private List<Integer> prefixProducts;

        public ProductOfNumbers() {
            prefixProducts = new ArrayList<>();
            prefixProducts.add(1);
        }

        public void add(int num) {
            if(num == 0){
                prefixProducts.clear();
                prefixProducts.add(1);
            }else{
                prefixProducts.add(prefixProducts.getLast()*num);
            }
        }

        public int getProduct(int k) {
            int size = prefixProducts.size();

            if(k >= size) return 0;

            return prefixProducts.get(size - 1) / prefixProducts.get(size - 1 - k);
        }
    }
}
