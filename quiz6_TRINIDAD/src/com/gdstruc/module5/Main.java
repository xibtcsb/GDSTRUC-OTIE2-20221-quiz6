package com.gdstruc.module5;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        Node root = null;

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(-10);
        tree.insert(55);

        tree.traverseInOrderDescending();
        System.out.println();
        System.out.println("Min " + tree.getMin(root));
        System.out.println("Max " + tree.getMax(root));
    }
}
