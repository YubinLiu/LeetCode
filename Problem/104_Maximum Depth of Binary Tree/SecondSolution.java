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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();

        stack.push(root);
        value.push(1);

        int max = 0;

        while (stack.size() > 0) {
            TreeNode n = stack.pop();
            int temp = value.pop();
            max = Math.max(max, temp);
            if (n.left != null) {
                stack.push(n.left);
                value.push(temp + 1);
            }

            if (n.right != null) {
                stack.push(n.right);
                value.push(temp + 1);
            }
        }

        return max;
    }
}
