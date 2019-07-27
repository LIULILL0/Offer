package jianzhiOffer;

import java.util.ArrayList;

public class Offer57_2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int start = 1;
        int end = 2;
        while (end>start) {
            int s = (start + end) * (end - start + 1) / 2;
            if (s == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                res.add(list);
                end++;
            } else if (s > sum) {
                start++;
            } else
                end++;
        }
        return res;

    }

    public static void main(String[] args) {
        Offer57_2 o = new Offer57_2();
        System.out.println(o.FindContinuousSequence(15));
    }
}
