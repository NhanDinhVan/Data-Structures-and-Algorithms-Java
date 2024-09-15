package org.example.data_structures.tree;

/**
 * TreeTest
 * <p>
 * Version 1.0
 * <p>
 * Date:  9/14/24
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 9/14/24   NhanDinhVan    Create
 */
public class TreeTest {
    public static void main(String[] args) {

        MyBinarySearchTree MyBTS = new MyBinarySearchTree();
        MyBTS.root = MyBTS.insert(MyBTS.root,5);
        System.out.println("Inserting: 5");
        System.out.println("Root after inserting 5: " + MyBTS.root);
        MyBTS.root = MyBTS.insert(MyBTS.root,7);
        MyBTS.root = MyBTS.insert(MyBTS.root,6);
        MyBTS.root = MyBTS.insert(MyBTS.root,4);
        MyBTS.root = MyBTS.insert(MyBTS.root,3);

        System.out.println(MyBTS.root.toString()+"hi");
        System.out.println("hi");
    }
}
