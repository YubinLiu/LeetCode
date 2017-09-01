/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SecondSolution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode l = root.left;
        TreeNode r = root.right;
        stack.push(l);
        stack.push(r);

        while (stack.size() > 1) {
            l = stack.pop();
            r = stack.pop();

            if (l == null && r == null) continue;
            if (l == null || r == null) return false;
            if (l.val != r.val) return false;

            stack.push(l.left);
            stack.push(r.right);
            stack.push(l.right);
            stack.push(r.left);
        }

        return true;
    }

}
