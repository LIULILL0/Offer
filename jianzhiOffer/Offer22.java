package jianzhiOffer;

public class Offer22 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode p = dummyNode;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            if (p.next != null) {
                p = p.next;
            } else
                return null;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }
}
