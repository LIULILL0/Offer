package jianzhiOffer;

public class Offer15 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n-1) &n;
        }
        return count;
    }

    public static void main(String[] args) {
        Offer15 o = new Offer15();
        System.out.println(o.NumberOf1(15));
    }
}
