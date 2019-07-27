package jianzhiOffer;

public class Offer52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)return null;
        int count1 = 0;
        ListNode p = pHead1;
        ListNode q = pHead2;
        while (p != null) {
            count1++;
            p = p.next;
        }
        int count2 = 0;
        while (q != null) {
            count2++;
            q = q.next;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        if (count1 > count2) {
            for (int i = 0; i < count1 - count2; i++) {
                p1 = p1.next;
            }
        } else {
            for (int j = 0; j < count2 - count1; j++) {
                p2 = p2.next;
            }
        }
        while (p1!=p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p12 = new ListNode(2);
        ListNode p13 = new ListNode(3);

        ListNode p16 = new ListNode(6);
        ListNode p17 = new ListNode(7);
        p1.next = p12;
        p12.next=p13;
        p13.next = p16;
        p16.next=p17;


        ListNode p24 = new ListNode(4);
        ListNode p25 = new ListNode(5);

        p24.next=p25;
        p25.next=p16;

        Offer52 o =new Offer52();
        System.out.println(o.FindFirstCommonNode(p1,p24));




    }
}
