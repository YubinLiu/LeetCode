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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (nodes.size() > 0) {
            List<Integer> values = new LinkedList<>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = nodes.removeFirst();
                values.add(temp.val);
                if (temp.left != null) nodes.add(temp.left);
                if (temp.right != null) nodes.add(temp.right);
            }
            result.add(0, values);
        }

        return result;
    }
}
