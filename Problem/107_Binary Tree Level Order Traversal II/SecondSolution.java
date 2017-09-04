/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.List;
import java.util.LinkedList;

public class SecondSolution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        levelOrderBottom(root, result, 1);
        return result;
    }

    public void levelOrderBottom(TreeNode node, List<List<Integer>> result, int level) {
        if (node == null) return;

        if (result.size() < level) {
            result.add(0, new LinkedList<Integer>());
        }

        result.get(result.size() - level).add(node.val);
        levelOrderBottom(node.left, result, level + 1);
        levelOrderBottom(node.right, result, level + 1);
    }
}
