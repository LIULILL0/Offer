package jianzhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Offer45 {
    public  String PrintMinNumber(int[] numbers) {
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s2.compareTo(s1);

            }
        });

        for(Integer c : list){
            s+=c;
        }
        return s;
    }

    public static void main(String[] args) {
        Offer45 o = new Offer45();
        int[] a = {3,32,321};
        System.out.println(o.PrintMinNumber(a));
    }
}
