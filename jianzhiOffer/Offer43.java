package jianzhiOffer;

public class Offer43 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += CountNumberOf1(i);
        }
        return count;
    }

    private int CountNumberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            if (n % 10 == 1) {
                sum++;
            }
            n = n / 10;
        }
        return sum;

    }

    /**
     *
     * 取第  i  位左边（高位）的数字，乘以  10 i−1 ，得到基础值  a 。
     * 取第  i  位数字，计算修正值：
     *
     *     如果大于 X，则结果为  a+ 10 i−1 。
     *     如果小于 X，则结果为  a 。
     *     如果等 X，则取第  i  位右边（低位）数字，设为  b ，最后结果为  a+b+1 。
     * @param n
     * @param x
     * @return
     */
    //此时可以扩展到[1,9]的任意一个数
    public int NumberOf1Between1AndN_Solution1(int n, int x) {
        if (n < 0 || x < 1 || x > 9)
            return 0;

        int high, low, curr, temp, i = 1;
        high = n;
        int total = 0;

        while (high != 0) {
            high = n/(int)Math.pow(10,i);
            temp = n % (int)Math.pow(10,i);

            curr = temp/(int)Math.pow(10,i-1);

            low = temp % (int)Math.pow(10,i-1);
            if(curr==x){
                total+=high*(int)Math.pow(10,i-1)+low+1;
            }else if(curr<x){
                total+=high*(int)Math.pow(10,i-1);
            }else {
                total+=(high+1)*(int)Math.pow(10,i-1);
            }
            i++;
        }
        return total;

    }

    public static void main(String[] args) {
        Offer43 o = new Offer43();
        System.out.println(o.NumberOf1Between1AndN_Solution1(2593,5));
    }
}
