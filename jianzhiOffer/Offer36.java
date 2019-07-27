package jianzhiOffer;

public class Offer36 {
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        covert(pRootOfTree);
        return head;
    }

    private void covert(TreeNode pHead) {
        if (pHead == null)
            return;
        covert(pHead.left);
        if (head == null) {
            head = pHead;
            pre = pHead;
        } else {
            pre.right = pHead;
            pHead.left = pre;
            pre = pHead;
        }
        covert(pHead.right);
    }
}
