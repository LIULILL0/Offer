package jianzhiOffer;

import java.util.Arrays;

public class Offer61 {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length==0)
            return false;
        int countOf0 = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                countOf0++;
        }
        int distance = 0;
        for (int i = countOf0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1])
                return false;
            distance += numbers[i + 1] - numbers[i] - 1;
        }

        if (countOf0 >= distance) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Offer61 o = new Offer61();
        int[] a = {0, 3, 1, 6, 4};
        System.out.println(o.isContinuous(a));
    }
}
