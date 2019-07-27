package jianzhiOffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(k>input.length || k==0)
            return res;
        PriorityQueue<Integer> q = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (q.size() < k) {
                q.add(input[i]);
            }else {

            if (q.peek() > input[i]) {
                q.poll();
                q.add(input[i]);
            }
            }

        }
        for(int c :q){
            res.add(c);
    }
    return res;
}

    public static void main(String[] args) {
        Offer40 o = new Offer40();
        int[]a = {4,5,1,6,2,7,3,8};
        System.out.println(o.GetLeastNumbers_Solution(a,4));
    }
}
