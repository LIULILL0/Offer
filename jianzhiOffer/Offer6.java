package jianzhiOffer;

import java.util.ArrayList;

public class Offer6 {
        ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null)
            return res;
        printListFromTailToHead(listNode.next);
        res.add(listNode.val);

        return res;
    }
}
