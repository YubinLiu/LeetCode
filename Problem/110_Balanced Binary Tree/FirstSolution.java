/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FirstSolution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);

        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}
