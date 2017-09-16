/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class SecondSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aPointer = headA;
        ListNode bPointer = headB;
        int headALength = 0;
        int headBLength = 0;
        while (aPointer != null) {
            headALength++;
            aPointer = aPointer.next;
        }
        while (bPointer != null) {
            headBLength++;
            bPointer = bPointer.next;
        }
        while (headALength > headBLength) {
            headA = headA.next;
            headALength--;
        }
        while (headBLength > headALength) {
            headB = headB.next;
            headBLength--;
        }
        while (headA != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
