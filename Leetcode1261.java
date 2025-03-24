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

class Leetcode1261 {
    private Set<Integer> set;

    public Leetcode1261(TreeNode root) {
        set = new HashSet<>();
        recover(root, 0);
    }

    private void recover(TreeNode node, int val) {
        if (node == null)
            return;

        node.val = val;
        set.add(val);

        recover(node.left, 2 * val + 1);
        recover(node.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.right.left = new TreeNode(-1);
        root.right.left.left = new TreeNode(-1);

        Leetcode1261 solution = new Leetcode1261(root);
        System.out.println(solution.find(2));
        System.out.println(solution.find(3));
        System.out.println(solution.find(4));
        System.out.println(solution.find(5));
    }
}