package jianzhiOffer;

public class Offer18 {
    public void DeleteNode(ListNode node, ListNode delNopde) {
        if (node == delNopde)
            node = null;
        else if (delNopde.next == null) {
            ListNode p = node;
            while (p.next != delNopde) {
                p = p.next;
            }
            p.next = null;
        } else {
            delNopde.val = delNopde.next.val;
            delNopde.next = delNopde.next.next;
        }
        return;
    }

}
