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
public class FirstSolution {
    List<String> list = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) findPaths(root, String.valueOf(root.val));
        return list;
    }

    public void findPaths(TreeNode node, String path) {
        if (node.left == null && node.right == null) list.add(path);
        if (node.left != null) findPaths(node.left, path + "->" + node.left.val);
        if (node.right != null) findPaths(node.right, path + "->" + node.right.val);
    }
}
