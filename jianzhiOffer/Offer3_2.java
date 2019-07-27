package jianzhiOffer;

public class Offer3_2 {
    public static int duplicate(int numbers[], int length) {
        for (int i : numbers) {
            if (i >= length || i <= 0)
                return -1;
        }
        int start = 1;
        int end = length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int count = CountRange(numbers, start, length, mid);
            if (end == start) {
                if (count > 1)
                    return start;
                else
                    break;
            } else if (count > (mid - start + 1)) {
                end = mid;
            } else
                start = mid+1;

        }
        return -1 ;
    }

    private static int CountRange(int[] numbers, int start, int length, int end) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[]numbers = {2,3,5,4,3,2,6,7};
        System.out.println(duplicate(numbers,8));
    }

}
