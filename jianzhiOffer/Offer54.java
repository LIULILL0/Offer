package jianzhiOffer;

import java.util.ArrayList;

public class Offer54 {
    ArrayList<TreeNode> res = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k == 0)
            return null;
        pre(pRoot);
        if (k > res.size())
            return null;
        return res.get(k - 1);

    }

    private void pre(TreeNode pRoot) {
        if (pRoot == null)
            return;
        pre(pRoot.left);
        res.add(pRoot);
        pre(pRoot.right);

    }
}
