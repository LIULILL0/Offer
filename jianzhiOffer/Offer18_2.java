package jianzhiOffer;

public class Offer18_2 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        //设置一个虚节点
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = pHead;
        ListNode p = dummyNode;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next!=null && cur.next.val == cur.val) {
                while (cur.next != null && cur.next.val == cur.val) {
                    cur = cur.next;
                }
                p.next = cur.next;
            } else {
                p = cur;
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n31 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n31;
        n31.next=n4;
        Offer18_2 o = new Offer18_2();
        System.out.println(o.deleteDuplication(n1));

    }

}
