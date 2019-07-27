package jianzhiOffer;

public class Offer53_2 {
    public int MissingNumber(int[] numbers, int length) {
        if (numbers == null || length == 0)
            return 0;

        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] != mid) {
                if (numbers[mid] != mid && numbers[mid - 1] == mid - 1)
                    return mid;
                else {
                    end = mid-1;
                }

            }else {
                start = mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Offer53_2 o = new Offer53_2();
        int[]a = {0,1,2,3,4,4};
        System.out.println(o.MissingNumber(a,6));
    }
}
