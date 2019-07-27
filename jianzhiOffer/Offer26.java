package jianzhiOffer;

public class Offer26 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                flag = HasSubtree2(root1, root2);
            }

            if (!flag ) {
                flag = HasSubtree(root1.left,root2);
            }
            if(!flag){
                flag = HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }

    private boolean HasSubtree2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2!=null)
            return false;

        if (root2 == null)
            return true;

        if (root1.val != root2.val)
            return false;

        return HasSubtree2(root1.left, root2.left) && HasSubtree2(root1.right, root2.right);
    }
}
