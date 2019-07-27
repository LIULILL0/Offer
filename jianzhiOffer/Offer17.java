package jianzhiOffer;

public class Offer17 {
    public void printToMaxOfDigits(int n) {
        if (n <= 0)
            return;

        char[] numbers = new char[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = '0';
        }
        prints(numbers,0,n);
    }

    private void prints(char[] numbers, int index, int n) {
        if (index == n ) {
            pt(numbers);
            return;
        }
        for (int i = 0; i < 10; i++) {
            numbers[index ] = (char) (i + '0');
            prints(numbers, index + 1, n);
        }
    }

    private void pt(char[] numbers) {
        boolean isBegin0 = true;
        for (int i = 0; i < numbers.length; i++) {
            if(isBegin0 && numbers[i]!='0'){
                isBegin0 = false;
            }
            if(!isBegin0){
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Offer17 o = new Offer17();
        o.printToMaxOfDigits(3);
    }
}
