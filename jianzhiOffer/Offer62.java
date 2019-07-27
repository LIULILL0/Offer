package jianzhiOffer;

import java.util.ArrayList;

public class Offer62 {
    public int LastRemaining_Solution(int n, int m) {

        if (m >= n)
            return 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(i);
        }
        int idx = 0;
        while (!res.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                idx = (idx + 1) % res.size();
            }
            res.remove(idx);
            if (res.size() == 1)
                break;
        }
        return res.get(0);

    }

    public static void main(String[] args) {
        Offer62 o = new Offer62();
        System.out.println(o.LastRemaining_Solution(5, 3));
    }
}
