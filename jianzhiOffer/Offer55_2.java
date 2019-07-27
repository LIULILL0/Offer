package jianzhiOffer;

 class Offer54_2 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return g(root) != -1;
    }

    public int g(TreeNode root) {
        if (root == null)
            return 0;

        int left = g(root.left);
        if (left == -1)
            return -1;
        int right = g(root.right);
        if (right == -1)
            return -1;

        return Math.abs(left - right)>1?-1: 1+Math.max(left ,right);


    }
}
