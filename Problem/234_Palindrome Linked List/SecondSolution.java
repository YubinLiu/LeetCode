/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SecondSolution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        int length = 0;
        ListNode p = head;
        while(p != null) {
            length ++;
            p = p.next;
        }
        p = head;
        if(length == 1) return true;

        int half = (length + 1) / 2;
        ListNode q = head;
        for(int i = 0; i < half; i ++) q = q.next;

        ListNode r = q.next;
        q.next = null;
        ListNode m;
        while(r != null) {
            m = r.next;
            r.next = q;
            q = r;
            r = m;
        }

        while(q != null && p != null) {
            if(p.val == q.val) {
                q = q.next;
                p = p.next;
            }else {
                return false;
            }

        }
        return true;
    }
}
