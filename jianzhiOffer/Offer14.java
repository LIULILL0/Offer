package jianzhiOffer;

import java.util.Arrays;

public class Offer14 {
    int[]memo;
    //贪婪算法
    public static int MaxProductAferCutting(int length) {
        if (length <= 1)
            return -1;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;
        int numberOf3 = length % 3;
        int p = length / 3;
        if (numberOf3 == 0)
            return (int) Math.pow(3, p);
        else if (numberOf3 == 2)
            return (int) Math.pow(3, p) * 2;
        else if (numberOf3 == 1)
            return (int) Math.pow(3, p - 1) * 2 * 2;

        return -1;
    }

    //动态规划
    public static int MaxProductAferCutting1(int length) {
        int[] dp = new int[length + 1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        for (int i = 2; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(Math.max(j * (i - j), j * dp[i - j]), dp[i]);
            }
        }
        return dp[length];

    }

    //记忆化搜索
    public  int MaxProductAferCutting2(int length) {
        memo= new int[length+1];
        Arrays.fill(memo,-1);
        return breakInteger(length);
    }

    private  int breakInteger(int length) {
        if (length == 1)
            return 1;
        if(memo[length]!=-1){
            return memo[length];
        }
        int res = 0;
        for(int i=1;i<=length-1;i++){
            res = Math.max(Math.max(i*(length-i),i*breakInteger(length-i)),res);
        }
        memo[length] = res;
        return res;

    }


    public static void main(String[] args) {
        System.out.println(new Offer14().MaxProductAferCutting2(8));
    }
}
