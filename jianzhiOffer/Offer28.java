package jianzhiOffer;

public class Offer28 {
    boolean isSymmetrical(TreeNode pRoot) {
        return is(pRoot, pRoot);
    }

    private boolean is(TreeNode pRoot, TreeNode pRoot1) {
        if (pRoot == null && pRoot1 == null)
            return true;

        if (pRoot == null || pRoot1 == null)
            return false;
        if (pRoot.val != pRoot1.val)
            return false;

        return is(pRoot.left,pRoot1.right) && is(pRoot.right,pRoot1.left);

    }
}
