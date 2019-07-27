package jianzhiOffer;

public class Offer12 {
    boolean[][] used;
    int[][] dir = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        used = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                return hasCorePath(matrix, cols, rows, str, i, j, 0);
            }
        }
        return false;
    }

    private boolean hasCorePath(char[] matrix, int cols, int rows, char[] str, int x, int y, int index) {
        if (str.length - 1 == index) {
            return matrix[x * cols + y] == str[index];
        }
        if (str[index] == matrix[x * cols + y]) {
            used[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + dir[i][0];
                int newY = y + dir[i][1];
                if (isArea(newX, newY, rows, cols) && !used[newX][newY] && hasCorePath(matrix, cols, rows, str, newX, newY, index + 1)) {
                    return true;
                }
            }
            used[x][y] = false;
        }

        return false;
    }

    private boolean isArea(int newX, int newY, int rows, int cols) {
        return newX >= 0 && newX < rows && newY >= 0 && newY < cols;
    }

    public static void main(String[] args) {
        Offer12 o = new Offer12();

        String s = "ABCESFCSADEE";
        char[] s1 = s.toCharArray();

        String s3 = "ABCCED";
        char[] s4 = s3.toCharArray();
        System.out.println(o.hasPath(s1, 3, 4, s4));
    }

}
