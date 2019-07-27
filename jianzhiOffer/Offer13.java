package jianzhiOffer;

public class Offer13 {

    boolean[][] used;
    int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    int count = 0;

    public int movingCount(int threshold, int rows, int cols) {
        used = new boolean[rows][cols];

        movingCoreCount(threshold, rows, cols, 0, 0);

        return count;

    }

    private void movingCoreCount(int threshold, int rows, int cols, int x, int y) {
        used[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];
            if (isArea(rows, cols, newX, newY) && !used[newX][newY] && isLessThreshold(threshold, newX, newY)) {
                movingCoreCount(threshold, rows, cols, newX, newY);
            }
        }
    }

    private boolean isLessThreshold(int threshold, int x, int y) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        while (y != 0) {
            sum += y % 10;
            y = y / 10;
        }
        return sum <= threshold;


    }

    private boolean isArea(int rows, int cols, int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
    public static void main(String[] args) {
        Offer13 o = new Offer13();
        System.out.println(o.movingCount(10, 1, 100));
    }
}
