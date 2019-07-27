package jianzhiOffer;

public class Offer16 {
    public double Power(double base, int exponent) {
        int n;
        if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("参数异常");
            }
            n = -exponent;
        } else if (exponent > 0) {
            n = exponent;
        } else
            return 1;
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = base*result;
        }
        if(exponent>0)
            return result;
        else
            return 1/result;
    }

    public static void main(String[] args) {
        Offer16 o = new Offer16();
        System.out.println(o.Power(2,-3));
    }
}
