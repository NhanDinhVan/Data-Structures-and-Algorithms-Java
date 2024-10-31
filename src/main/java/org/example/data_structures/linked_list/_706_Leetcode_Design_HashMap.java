package org.example.data_structures.linked_list;

import javafx.util.Pair;

/**
 * _706_Leetcode_Design_HashMap
 * <p>
 * Version 1.0
 * <p>
 * Date:  10/31/2024
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 10/31/2024    NhanDinhVan    Create
 */
class MyHashMap {
    Node<int[]> head;

    public MyHashMap() {
        head = new Node<>(new int[2]); // Dummy head node
    }

    public void put(int key, int value) {
        Node<int[]> curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getNext().getData()[0] == key) { // Key found, update value
                curNode.getNext().getData()[1] = value;
                return;
            }
            curNode = curNode.getNext();
        }
        // Key not found, add new node at the beginning
        Node<int[]> newNode = new Node<>(new int[] {key, value});
        newNode.setNext(head.getNext());
        head.setNext(newNode);
    }

    public int get(int key) {
        Node<int[]> curNode = head.getNext(); // Start from the first actual node
        while (curNode != null) {
            if (curNode.getData()[0] == key) {
                return curNode.getData()[1]; // Return value associated with key
            }
            curNode = curNode.getNext();
        }
        return -1; // Key not found
    }

    public void remove(int key) {
        Node<int[]> curNode = head;
        while (curNode.getNext() != null) {
            if (curNode.getNext().getData()[0] == key) {
                curNode.setNext(curNode.getNext().getNext()); // Remove the node with the key
                return;
            }
            curNode = curNode.getNext();
        }
    }

//    public class Node<T> {
//        private T data;
//        private Node<T> next;
//
//        public Node(T data) {
//            this.data = data;
//        }
//
//        public Node(T data, Node<T> next) {
//            this.data = data;
//            this.next = next;
//        }
//
//        public T getData() {
//            return data;
//        }
//
//        public void setData(T data) {
//            this.data = data;
//        }
//
//        public Node<T> getNext() {
//            return next;
//        }
//
//        public void setNext(Node<T> next) {
//            this.next = next;
//        }
//    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
