package jianzhiOffer;

public class Offer33 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        if (sequence.length == 1)
            return true;
        return judge(sequence, 0, sequence.length - 1);

    }

    private boolean judge(int[] sequence, int start, int end) {
        if (start >= end)
            return true;
        int root = sequence[end];
        int start1 = start;
        for (; start < end; start++) {
            if (sequence[start] > root)
                break;
        }
        int start2 = start;
        for (int i = start2; i < end; i++) {
            if (sequence[i] <= root)
                return false;
        }

        if (judge(sequence, start1, start2 - 1) && judge(sequence, start2, end - 1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Offer33 o = new Offer33();
        int[]a = {7,4,6,5};
        System.out.println(o.VerifySquenceOfBST(a));
    }
}
