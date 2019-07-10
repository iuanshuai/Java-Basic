package me.syus.homework.algorithm.binary;

import me.syus.homework.algorithm.support.TreeNode;

public class Dfs {
    public void preOrder(TreeNode n) {
        if (n != null) {
            System.out.println(n);
        } else {
            return;
        }
        if (n.left != null) {
            preOrder(n.left);
        }
        if (n.right != null) {
            preOrder(n.right);
        }
    }




    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(1);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(2);
        tree.right.right = new TreeNode(2);

        Dfs d = new Dfs();
        d.preOrder(tree);
    }
}
