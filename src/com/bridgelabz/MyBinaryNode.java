package com.bridgelabz;

/**
 * Creating MyBinaryNode class to store Tree node information
 * like key, left and right.
 * Here key is of Comparable type
 * @param <K> - generic key type which is a Comparable type
 */

public class MyBinaryNode<K extends Comparable<K>>{
    public K key;
    public MyBinaryNode left;
    public MyBinaryNode right;

    /**
     * Parameterized constructor to assign the default values to instance variables
     * @param key - key to store into tree node
     */
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
