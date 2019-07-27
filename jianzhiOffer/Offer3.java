package jianzhiOffer;

public class Offer3 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null) {
            duplication[0] = -1;
            return false;

        }
        for (int i : numbers) {
            if (i >= length || i < 0)
                return false;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 1, 4};
        int[] d = new int[1];
        System.out.println(new Offer3().duplicate(numbers, 5, d));
        for (int i : d) {
            System.out.println(i);
        }
    }
}
