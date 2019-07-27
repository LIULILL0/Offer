package jianzhiOffer;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Offer59 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (list.size() == size) {
                res.add(Collections.max(list));
                list.removeFirst();
                list.addLast(num[i]);
            } else {
                list.addLast(num[i]);
            }
        }
        res.add(Collections.max(list));
        return res;
    }

    public ArrayList<Integer> maxInWindows1(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            if (q.isEmpty()) {
                q.addLast(i);
            }
            if (i - q.peekFirst() >= size) {
                q.removeFirst();
            }

            while (!q.isEmpty() && num[q.peekLast()] <= num[i]) {
                q.removeLast();
            }
            q.add(i);
            if (i >= size - 1) {
                res.add(num[q.peekFirst()]);
            }


        }
        return res;
    }

    public static void main(String[] args) {
        Offer59 o = new Offer59();
        int[] a = {2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(o.maxInWindows1(a, 3));
    }
}
