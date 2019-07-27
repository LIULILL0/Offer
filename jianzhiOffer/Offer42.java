package jianzhiOffer;

public class Offer42 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int curMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (curMax >= 0) {
                curMax+=array[i];
            }else
                curMax = array[i];

            if(curMax>max){
                max = curMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Offer42 o = new Offer42();
        int[] a = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(o.FindGreatestSumOfSubArray(a));
    }
}
