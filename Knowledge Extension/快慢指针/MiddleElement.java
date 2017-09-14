public class MiddleElement {
    public int findTheMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null) {
            if (fast.next == null) return slow.val;
            if (fast.next != null && fast.next.next == null) return (slow.val + slow.next.val) / 2;
            else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        System.out.println(new MiddleElement().findTheMiddle(node1));

        ListNode node4 = new ListNode(4);
        node3.next = node4;
        System.out.println(new MiddleElement().findTheMiddle(node1));
    }
}
