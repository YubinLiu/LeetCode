/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Stack;
public class FirstSolution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();
        stack.push(slow.val);
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow.val);
        }
        if (fast.next != null) slow = slow.next;

        while (slow != null) {
            if (stack.pop() != slow.val) return false;
            slow = slow.next;
        }

        return true;
    }
}
