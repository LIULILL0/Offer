package jianzhiOffer;

public class Offer23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = pHead;
        ListNode slow = dummyNode;
        ListNode fast = pHead;

        while (slow != fast) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }

        int circle = 1;
        while (fast.next != slow) {
            fast = fast.next;
            circle++;
        }
        ListNode pre = pHead;
        ListNode cur = pHead;
        for (int i = 1; i < circle; i++) {
            cur = cur.next;
        }
        while (cur.next != pre) {
            cur = cur.next;
            pre = pre.next;
        }

        return pre;
    }
}