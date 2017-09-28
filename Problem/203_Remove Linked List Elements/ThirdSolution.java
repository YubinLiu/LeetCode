/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ThirdSolution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode helperHead = new ListNode(0);
        helperHead.next = head;
        ListNode temp = helperHead;

        while (temp.next != null) {
            if (temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }

        return helperHead.next;
    }
}
