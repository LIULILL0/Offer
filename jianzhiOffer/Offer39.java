package jianzhiOffer;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;

public class Offer39 {
    public int MoreThanHalfNum_Solution(int[] array) {
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                result = array[i];
                times = 1;
            } else if (array[i] == result) {
                times++;
            } else {
                times--;
            }
        }
        int r = 0;
        for (int i = 0; i < array.length; i++) {
            if (result == array[i])
                r++;
        }
        if (r > array.length / 2)
            return result;
        else
            return 0;


    }

    public int MoreThanHalfNum_Solution1(int[] array) {
        int m = array.length / 2;
        if (array.length==1)
            return array[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int c = map.get(array[i]) + 1;
                map.put(array[i], c);
                if (c > m) {
                    return array[i];
                }
            } else
                map.put(array[i], 1);
        }

        return 0;
    }

    public static void main(String[] args) {
        Offer39 o = new Offer39();
        int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(o.MoreThanHalfNum_Solution(a));
    }
}
