package jianzhiOffer;

import java.util.ArrayList;

public class Offer49 {
    public int GetUglyNumber_Solution(int index) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int indexOf2 = 0;
        int indexOf3 = 0;
        int indexOf5 = 0;
        while (list.size() < index) {
            int num2 = list.get(indexOf2) * 2;
            int num3 = list.get(indexOf3) * 3;
            int num5 = list.get(indexOf5) * 5;
            int min = Math.min(Math.min(num2,num3),num5);
            list.add(min);
            if(min==num2) indexOf2++;
            if(min==num3) indexOf3++;
            if(min==num5) indexOf5++;

        }
        return list.get(index-1);
    }

    public static void main(String[] args) {
        Offer49 o = new Offer49();
        System.out.println(o.GetUglyNumber_Solution(6));
    }
}
