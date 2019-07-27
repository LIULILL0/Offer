package jianzhiOffer;

public class Offer25 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if ( list2 == null)
            return list1;
        ListNode tempNode = null;
        if (list1.val >= list2.val) {
             tempNode = list2;
            tempNode.next = Merge(list1, list2.next);
        } else {
            tempNode = list1;
            tempNode.next = Merge(list1.next,list2);
        }

        return tempNode;
    }
}
