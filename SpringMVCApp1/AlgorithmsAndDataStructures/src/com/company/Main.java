package com.company;


import com.sun.source.tree.Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Main {
    static List<Integer> listValues = new LinkedList<>();
    static void breadthFirstValues(TreeNode root) {
        if(root==null)
            return;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.pollFirst();
            listValues.add(current.val);
            if(current.left!=null)
                queue.addLast(current.left);
            if(current.right!=null)
                queue.addLast(current.right);
        }
    }
    static void depthFirstValues(TreeNode root) {
        if(root==null)
            return;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.pollLast();
            listValues.add(current.val);
            if(current.right!=null)
                queue.addLast(current.right);
            if(current.left!=null)
                queue.addLast(current.left);
        }
    }
    public static void main(String[] args) {

    }
}
