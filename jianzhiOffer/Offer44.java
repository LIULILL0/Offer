package jianzhiOffer;

public class Offer44 {
    private int digitAtIndex(int index) {
        if (index < 0) return -1;
        int digits = 1;
        while (true) {
            int numDigits = nums(digits);

            int bitNums = numDigits * digits;

            if (index < bitNums) {
                return digitsIndex(index, digits);
            } else {
                index -= bitNums;
                digits++;
            }
        }
    }

    private int digitsIndex(int index, int digits) {
        int beginNums = beginN(digits) + index / digits;
        int right = digits - index % digits;
        for (int i = 1; i < right; i++) {
            beginNums /=10;

        }
        return beginNums%10;
    }

    private int beginN(int digits) {
        if (digits == 1)
            return 0;

        return (int) Math.pow(10, digits - 1);
    }


    private int nums(int digits) {
        if (digits == 1)
            return 10;
        int count = (int) Math.pow(10, digits - 1);
        return 9 * count;
    }

    public static void main(String[] args) {
        Offer44 o = new Offer44();
        System.out.println(o.digitAtIndex(19));
    }
}
