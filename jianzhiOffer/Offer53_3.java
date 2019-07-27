package jianzhiOffer;

public class Offer53_3 {
    public int gNumber(int[] numbers, int length) {

        if (numbers == null || numbers.length == 0)
            return 0;
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid]==mid)
                return mid;
            else if(numbers[mid]>mid){
                end = mid - 1;
            }else
                start = mid+1;
        }

        return 0;

    }

    public static void main(String[] args) {
        Offer53_3 o = new Offer53_3();
        int[] a = {-3,-1,1,3,5};
        System.out.println(o.gNumber(a,5));

    }
}
