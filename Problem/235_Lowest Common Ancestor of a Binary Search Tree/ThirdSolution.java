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
import java.util.ArrayList;
public class ThirdSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;

        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        pathP.add(root);
        pathQ.add(root);

        getPath(root, p, pathP);
        getPath(root, q, pathQ);

        TreeNode lca = null;
        int i;
        for (i = 0; i < pathP.size() && i < pathQ.size(); i++) {
            if (pathP.get(i) != pathQ.get(i)) break;
        }

        lca = pathP.get(i - 1);
        return lca;
    }

    public boolean getPath(TreeNode root, TreeNode n, List<TreeNode> path) {
        if (root == n) return true;

        if (root.left != null) {
            path.add(root.left);
            if (getPath(root.left, n, path)) return true;
            path.remove(path.size() - 1);
        }

        if (root.right != null) {
            path.add(root.right);
            if (getPath(root.right, n, path)) return true;
            path.remove(path.size() - 1);
        }

        return false;
    }
}
