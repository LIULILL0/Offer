package jianzhiOffer;

public class Offer27 {
    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        Mirror(root.left);
        Mirror(root.right);

    }
}
