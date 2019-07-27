package jianzhiOffer;

public class Offer35 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        //复制链表
        cloneNormal(pHead);
        //复制随机
        cloneRamdom(pHead);
        //断开链表
        return splitListNode(pHead);

    }

    private RandomListNode splitListNode(RandomListNode pHead) {
        RandomListNode nowNode = pHead;
        RandomListNode cloneHead = pHead.next;
        while (nowNode != null) {
            RandomListNode cloneNode = nowNode.next;
            nowNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            nowNode = nowNode.next;

        }
        return cloneHead;
    }


    private void cloneRamdom(RandomListNode pHead) {
        RandomListNode cur = pHead;
        //   RandomListNode cur1 = cur.next;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
    }

    private void cloneNormal(RandomListNode pHead) {
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode cur1 = new RandomListNode(cur.label);
            cur1.next = cur.next;
            cur.next = cur1;
            cur = cur1.next;
        }

    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}