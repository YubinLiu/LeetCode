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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode m, TreeNode n) {
        if (m == null || n == null) return m == n;
        return m.val == n.val && isSymmetric(m.left, n.right) && isSymmetric(m.right, n.left);
    }
}
