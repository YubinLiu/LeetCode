/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Stack;

public class SecondSolution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> values = new Stack<>();
        stack.push(root);
        values.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode tempNode = stack.pop();
            int tempVal = values.pop();

            if (tempVal == sum && tempNode.left == null && tempNode.right == null) return true;

            if (tempNode.left != null) {
                stack.push(tempNode.left);
                values.push(tempVal + tempNode.left.val);
            }

            if (tempNode.right != null) {
                stack.push(tempNode.right);
                values.push(tempVal + tempNode.right.val);
            }
        }

        return false;
    }
}
