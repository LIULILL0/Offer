package jianzhiOffer;

public class Offer55 {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        return Math.max(left,right)+1;
    }
}
