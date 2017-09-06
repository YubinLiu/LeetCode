/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Queue;
import java.util.LinkedList;

public class SecondSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();

        nodes.offer(root);
        values.offer(1);

        int max = 0;

        while (nodes.size() > 0) {
            TreeNode n = nodes.poll();
            int temp = values.poll();
            max = Math.max(max, temp);
            if (n.left != null) {
                nodes.offer(n.left);
                values.offer(temp + 1);
            }

            if (n.right != null) {
                nodes.offer(n.right);
                values.offer(temp + 1);
            }
        }

        return max;
    }
}
