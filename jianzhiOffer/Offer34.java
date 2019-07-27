package jianzhiOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class Offer34 {
    private ArrayList<ArrayList<Integer>> res;
    private ArrayList<Integer> list;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        res = new ArrayList<>();
        list = new ArrayList<>();
        dfs(root, target);
        return res;
    }

    private void dfs(TreeNode root, int target) {
        if (root == null)
            return;
        list.add(root.val);
        target-=root.val;
        if(root.left==null && root.right==null && target==0){
            res.add(new ArrayList<>(list));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        list.remove(list.size()-1);
    }
}
