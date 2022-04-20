package com.company;

class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public void printValue() {
        System.out.println("Value of current node equals "+value);
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value=value;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild=leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild=rightChild;
    }

}
public class BinarySearchTree {
    private Node rootTree;
    public BinarySearchTree() {
        rootTree=null;
    }
    public Node getRootTree() {
        return rootTree;
    }
    public void addNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if(rootTree==null) {
            rootTree=newNode;
        }
        else {
            Node currentNode = rootTree;
            Node parentNode;
            while(true) {
                parentNode=currentNode;
                if(value==currentNode.getValue())
                    return;
                else {
                    if(value<currentNode.getValue()) {
                        currentNode = currentNode.getLeftChild();
                        if(currentNode==null) {
                            parentNode.setLeftChild(newNode);
                            return;
                        }
                    }
                    else {
                        currentNode=currentNode.getRightChild();
                        if(currentNode==null) {
                            parentNode.setRightChild(newNode);
                            return;
                        }
                    }
                }
            }
        }
    }
    public Node findNodeByValue(int value) {
        Node currentNode = rootTree;
        while (currentNode.getValue()!=value) {
            if(value<currentNode.getValue()) {
                currentNode.getLeftChild();
            }
            else {
                currentNode.getRightChild();
            }
            if(currentNode==null)
                return null;
        }
        return currentNode;
    }
    public void preOrder(Node node) {
        if(node==null)
            return;
        System.out.print(node.getValue()+" ");
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
    }
    public void inOrder(Node node) {
        if(node==null)
            return;
        inOrder(node.getLeftChild());
        System.out.print(node.getValue()+" ");
        inOrder(node.getRightChild());
    }
}
