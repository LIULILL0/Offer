package jianzhiOffer;

public class Offer46 {
    public int translationCount(String number) {
        int[] dp = new int[number.length()];
        dp[0] = 1;
        for (int i = 1; i < number.length(); i++) {
            if (Integer.parseInt(number.substring(i - 1, i + 1)) < 26) {
                dp[i]=i==1?1:dp[i-2];
            }
            dp[i] = dp[i] +dp[i-1];
        }
        return dp[number.length()-1];
    }

    public static void main(String[] args) {
        Offer46 o = new Offer46();
        System.out.println(o.translationCount("12258"));
    }
}
