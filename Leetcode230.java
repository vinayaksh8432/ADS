import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Leetcode230 {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return result;
    }

    private void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        count--;
        if (count == 0) {
            result = node.val;
            return;
        }
        inorder(node.right);
    }

    public static void main(String[] args) {
        Leetcode230 solution = new Leetcode230();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(solution.kthSmallest(root, 1));
    }
}