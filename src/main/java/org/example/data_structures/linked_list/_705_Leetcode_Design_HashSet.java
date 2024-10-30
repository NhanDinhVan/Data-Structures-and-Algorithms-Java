package org.example.data_structures.linked_list;

/**
 * _705_Leetcode_Design_HashSet
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/30/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/30/2024    NhanDinhVan    Create
 */

public class _705_Leetcode_Design_HashSet {
    class MyHashSet {
        ListNode head;

        public MyHashSet() {
            head = null;
        }

        public void add(int key) {
            if(head == null){
                head = new ListNode(key);
                return;
            }

            if(contains(key)) return;

            ListNode curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = new ListNode(key);
        }

        public void remove(int key) {
            if(head == null) return;

            if(head.val == key){
                head = head.next;
                return;
            }
            ListNode tmp = head;
            while(tmp.next != null){
                if(tmp.next.val == key){
                    tmp.next = tmp.next.next;
                    return;
                }
                tmp = tmp.next;
            }
        }

        public boolean contains(int key) {
            if(head == null) return false;
            ListNode tmp = head;
            while(tmp != null){
                if(tmp.val == key){
                    return true;
                }
                tmp = tmp.next;
            }
            return false;
        }
    }
}
