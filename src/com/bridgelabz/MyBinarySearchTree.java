package com.bridgelabz;

/**
 * Creating MyBinarySearchTree class to store keys into tree using addRecursively method
 * inorder traversal method is provided to print the elements
 * @param <K> - generic key which is of comparable type
 */

public class MyBinarySearchTree<K extends Comparable<K>> {
    public MyBinaryNode<K> root;

    /**
     * add method to add key into tree
     * @param key - Key to store into the tree node
     */
    public void add(K key){
        this.root = this.addRecursively(root, key);

    }

    /**
     * Creating inOrderTraversal method to print elements
     * @param root - root node from where we need to star traversal
     */
    public void inOrderTraversal(MyBinaryNode<K> root) {
        if (root == null) {
            return;
        }
        this.inOrderTraversal(root.left);
        System.out.print(root.key +"->");
        this.inOrderTraversal(root.right);
    }

    /**
     * This method is to add nodes into tree structure using compareTo method and recursive methodology
     * @param currentRootNode - The root node object
     * @param key - key to store into the tree node
     * @return tree node in sorted order
     */
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> currentRootNode, K key) {
        if(currentRootNode == null)
            return new MyBinaryNode<>(key);

        int compareResult = key.compareTo(currentRootNode.key);
        if(compareResult == 0){
            return currentRootNode;
        }
        if(compareResult < 0){
            currentRootNode.left = this.addRecursively(currentRootNode.left, key);
        } else {
            currentRootNode.right = this.addRecursively(currentRootNode.right, key);
        }
        return currentRootNode;
    }

    /**
     * getSize method is to find the size of the tree using recur
     * @return the size of the tree
     */
    public int getSize() {
        return this.getRecursiveSize(this.root);
    }

    /**
     * This is a function which will be called recursively to find the size of the tree
     * @param currentRootNode - current node of the tree
     * @return the size of the tree
     */
    private int getRecursiveSize(MyBinaryNode<K> currentRootNode) {
        return currentRootNode == null ? 0 :1 + this.getRecursiveSize(currentRootNode.left) + this.getRecursiveSize(currentRootNode.right);
    }
}
