package jianzhiOffer;

import java.util.ArrayList;

public class Offer57 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array==null || array.length==0)
            return res;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            if((array[start]+array[end])==sum){
                res.add(array[start]);
                res.add(array[end]);
                break;
            }else if((array[start]+array[end])>sum){
                end--;
            }else {
                start++;
            }

        }
        return res;

    }
}
