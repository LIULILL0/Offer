package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

public class Offer32_3 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        //存放偶数层数据
        Stack<TreeNode> stack1 = new Stack<>();
        //存放奇数层数据
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null)
            return res;
        int layer = 0;
        stack2.push(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (layer % 2 != 0) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack1.isEmpty()) {
                    TreeNode temp = stack1.pop();
                    list.add(temp.val);
                    if (temp.right != null)
                        stack2.push(temp.right);
                    if (temp.left != null)
                        stack2.push(temp.left);
                }
                res.add(new ArrayList<>(list));
                list.clear();
                layer++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack2.isEmpty()) {
                    TreeNode temp = stack2.pop();
                    list.add(temp.val);
                    if (temp.left != null)
                        stack1.push(temp.left);
                    if (temp.right != null)
                        stack1.push(temp.right);
                }
                res.add(new ArrayList<>(list));
                list.clear();
                layer++;
            }
        }
        return res;

    }
}
