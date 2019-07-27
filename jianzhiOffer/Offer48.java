package jianzhiOffer;

import java.util.LinkedList;

public class Offer48 {
    private LinkedList<Character> list  =new LinkedList<>();
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n < 1)
            return 0;

        int[] num = new int[256];
        int l = 0, r = -1;
        int res = 0;

        while (l < n) {
            if ((r + 1) < n && num[s.charAt(r + 1)] == 0) {
                r++;

                num[s.charAt(r)]++;
            } else {

                num[s.charAt(l)]--;
                l++;

            }

            res = Math.max(res, r - l + 1);


        }
        return res;

    }

    public static void main(String[] args) {
        Offer48 o = new Offer48();
        System.out.println(o.lengthOfLongestSubstring("arabcacfr"));
    }
}
