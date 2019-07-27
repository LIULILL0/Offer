package jianzhiOffer;

public class Offer21 {
    //对顺序没有要求
    public void reOrderArray(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            while (high >= low && array[low] % 2 != 0) {
                low++;
            }

            while (high >= low && array[high] % 2 == 0) {
                high--;
            }
            if(high>=low){

            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            }
            low++;
            high--;
        }
        for(int c :array){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6};
        Offer21 o = new Offer21();
        o.reOrderArray(a);
    }
}
