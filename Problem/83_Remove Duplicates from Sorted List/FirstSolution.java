/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class FirstSolution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null) break;

            if (temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }

        return head;
    }
}
