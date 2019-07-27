package jianzhiOffer;

public class Offer15_2 {
    public boolean isTow(int n) {
        int n1 = n - 1;
        if ((n & n1) == 0)
            return true;

        return false;

    }

    public static void main(String[] args) {
        Offer15_2 o =new Offer15_2();
        System.out.println(o.isTow(9));
    }
}
