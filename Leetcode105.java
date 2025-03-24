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

class Leetcode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd,
            Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = map.get(root.val);
        int leftSize = rootIndex - inStart;

        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, rootIndex - 1, map);
        root.right = buildTreeHelper(preorder, preStart + leftSize + 1, preEnd,
                inorder, rootIndex + 1, inEnd, map);

        return root;
    }

    public static void main(String[] args) {
        Leetcode105 solution = new Leetcode105();
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };
        TreeNode root = solution.buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}