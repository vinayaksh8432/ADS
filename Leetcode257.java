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

class Leetcode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null)
            return paths;

        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        path += node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        path += "->";
        if (node.left != null)
            dfs(node.left, path, paths);
        if (node.right != null)
            dfs(node.right, path, paths);
    }

    public static void main(String[] args) {
        Leetcode257 solution = new Leetcode257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(solution.binaryTreePaths(root));
    }
}