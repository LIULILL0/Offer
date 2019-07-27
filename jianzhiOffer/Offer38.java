package jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Offer38 {
    boolean used[];
    ArrayList<String> res;

    public ArrayList<String> Permutation(String str) {
        res = new ArrayList<>();
        used = new boolean[str.length()];
        LinkedList<Character> l = new LinkedList<>();
        dfs(str, 0, l);
        return res;
    }

    private void dfs(String str, int index, LinkedList<Character> l) {
        if (index == str.length()) {
            res.add(l.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!used[i]) {
               used[i] = true;
               l.addLast(str.charAt(i));
               dfs(str,index+1,l);
               used[i] = false;
               l.removeLast();
            }

        }
        return;
    }

    public static void main(String[] args) {
        Offer38 l =new Offer38();
        System.out.println(l.Permutation("abc"));
    }
}
