package jianzhiOffer;

public class Offer63 {
    public int maxProfit(int[] arr) {
        if (arr.length < 1 || arr == null || arr.length == 0)
            return 0;

        if(arr==null || arr.length==0){
            return 0;
        }
        int min = arr[0];
        int maxProfit = 0;

        for(int i=1;i<arr.length;i++){

             min = Math.min(min,arr[i]);
            int cur = arr[i] - min;

            maxProfit = Math.max(maxProfit,cur);

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Offer63 o = new Offer63();
        int[]a = {9,11,8,5,7,12,16,14};
        System.out.println(o.maxProfit(a));
    }
}
