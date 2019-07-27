package jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer38_2 {
   ArrayList<String> res;

    public ArrayList<String> Permutation(String str) {
        res = new ArrayList<>();
        LinkedList<Character> l = new LinkedList<>();
        res.add(l.toString());
        dfs(str, 0, l);
        return res;

    }

    private void dfs(String str, int index, LinkedList<Character> list) {
        if (index > str.length())
            return;

        for (int i = index; i < str.length(); i++) {
            list.addLast(str.charAt(i));
            res.add(list.toString());
            dfs(str,i+1,list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Offer38_2 o = new Offer38_2();

        System.out.println(o.Permutation("abc"));
    }
}
