package jianzhiOffer;

public class Offer11 {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0 || array == null)
            return -1;

        int low = 0;
        int high = array.length - 1;
        int mid = low;
        while (array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (array[low] == array[mid] && array[mid] == array[high]) {
                return minNumber(array);
            }

            if (array[mid] >= array[low]) {
                low = mid;
            } else if (array[mid] <= array[high]) {
                high = mid;
            }
        }
        return array[mid];
    }

    private static int minNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(a));
    }
}
