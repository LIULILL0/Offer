package jianzhiOffer;

public class Offer56 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 0)
            return;

        int res = 0;
        for (int c : array) {
            res ^= c;
        }
        int firstOnbit = findFirstBit(res);
        int result1 = 0;
        int result2 = 0;
        for (int n : array) {
            if(bs(firstOnbit,n)){
                result1 ^=n;
                num1[0] = result1;
            }else {
                result2 ^=n;
                num2[0] = result2;

            }
        }
    }

    private boolean bs(int firstOnbit,int n) {
        int number = n>>firstOnbit;
        return (number & 1)==0;


    }

    private int findFirstBit(int res) {
        int index = 0;
        while ((res & 1) == 0 && index < 32) {
            res = res >> 1;
            index++;
        }
        return index;

    }

    /**
     *
     * public void findNumber(int[] array) {
     *         int res = 0;
     *         for (int i = 0; i < array.length; i++) {
     *             res ^= array[i];
     *         }
     *         int firstBitOf1 = findOf1(res);
     *         int[] dia = new int[1];
     *         int[] dia1 = new int[1];
     *         for (int i = 0; i < array.length; i++) {
     *             if (isParation(array[i], firstBitOf1)) {
     *                 dia[0] ^= array[i];
     *             } else {
     *                 dia1[0] ^= array[i];
     *             }
     *         }
     *         System.out.println(dia[0] + "" + dia1[0]);
     *     }
     *
     *     private boolean isParation(int number, int index) {
     *         return ((number >> index) & 1) == 1 ? true : false;
     *     }
     *
     *     private int findOf1(int res) {
     *         int index = 0;
     *         while ((res & 1) == 0 && index < 32) {
     *             res = res >> 1;
     *             index++;
     *         }
     *         return index;
     *     }
     * @param args
     */

    public static void main(String[] args) {
        Offer56 o =new Offer56();
        int[]a = {2,4,3,6,3,2,5,5};
        int[] a1 =new int[1];
        int []a2 = new int[1];
        o.FindNumsAppearOnce(a,a1,a2);
        for(int c :a1){
            System.out.println(c);
        }
        for(int b :a2){
            System.out.println(b);
        }


    }
}
