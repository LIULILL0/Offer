package jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32_2 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (pRoot == null)
            return res;

        q.offer(pRoot);
        int start = 0;
        int end = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            list.add(temp.val);
            start++;
            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
            if (start == end) {
                start = 0;
                end = q.size();
                res.add(new ArrayList<>(list));
                list.clear();
            }
        }
        return res;
    }
}
