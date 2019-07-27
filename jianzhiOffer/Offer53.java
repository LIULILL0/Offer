package jianzhiOffer;

public class Offer53 {
    public int GetNumberOfK(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] != mid) {
                if (mid == 0 || array[mid - 1] == mid - 1)
                    return mid;
                else
                    high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int GetNumberOfK1(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == array[mid])
                return mid;
            else if (mid > array[mid]) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Offer53 o = new Offer53();
        int[] a = {-3,-1,1,3,5};
        System.out.println(o.GetNumberOfK1(a));
    }
}
