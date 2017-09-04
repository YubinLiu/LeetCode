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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int length = nums.length;

        TreeNode head = new TreeNode(0);

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> leftIndexStack = new Stack<>();
        Stack<Integer> rightIndexStack = new Stack<>();

        nodeStack.add(head);
        leftIndexStack.add(0);
        rightIndexStack.add(length - 1);

        while (nodeStack.size() > 0) {
            TreeNode temp = nodeStack.pop();
            int left = leftIndexStack.pop();
            int right = rightIndexStack.pop();
            int mid = (right - left) / 2 + left;
            temp.val = nums[mid];

            if (left <= mid - 1) {
                temp.left = new TreeNode(0);
                nodeStack.push(temp.left);
                leftIndexStack.push(left);
                rightIndexStack.push(mid - 1);
            }
            if (mid + 1 <= right) {
                temp.right = new TreeNode(0);
                nodeStack.push(temp.right);
                leftIndexStack.push(mid + 1);
                rightIndexStack.push(right);
            }
        }

        return head;
    }
}
