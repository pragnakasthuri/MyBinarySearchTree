package com.bridgelabz;

/**
 * Ability to create a BST by adding the given elements in assignment
 */
public class MyBinarySearchTreeTest {

    /**
     * Main method for manipulating Binary Search Tree
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Creating the object for myBinarySearchTree
         * 2.Adding nodes to Binary Tree
         * 3.Calling inOrderTraversal method to print the tree in sorted order
         * 4.Calling the getSize method to print the size of the tree
         */

        /**
         * 1.Creating the object for myBinarySearchTree
         */
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();

        /**
         * 2.Adding nodes to Binary Tree
         */
        myBinarySearchTree.add(56);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(70);
        myBinarySearchTree.add(22);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(95);
        myBinarySearchTree.add(11);
        myBinarySearchTree.add(65);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(16);
        myBinarySearchTree.add(63);
        myBinarySearchTree.add(67);


        /**
         * 3.Calling inOrderTraversal method to print the tree in sorted order
         */
        myBinarySearchTree.inOrderTraversal(myBinarySearchTree.root);
        System.out.println();

        /**
         * 4.Calling the getSize method to print the size of the tree
         */
        System.out.println("Size Of My Binary Tree: " +myBinarySearchTree.getSize());
    }
}
