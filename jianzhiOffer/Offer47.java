package jianzhiOffer;

public class Offer47 {
    public int maxValueOfGifts(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = values[i][j];
                } else if (i == 0) {
                    dp[i][j] = values[i][j] + dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = values[i][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+values[i][j];
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}
