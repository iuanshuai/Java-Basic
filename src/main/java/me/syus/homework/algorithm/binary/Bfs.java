package me.syus.homework.algorithm.binary;

import me.syus.homework.algorithm.support.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public void bfsPrintTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                TreeNode node = queue.poll();
                System.out.println(node);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(1);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(2);
        tree.right.right = new TreeNode(2);

        Bfs b = new Bfs();
        b.bfsPrintTree(tree);
    }
}
