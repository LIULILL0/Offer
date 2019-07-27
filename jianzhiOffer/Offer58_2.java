package jianzhiOffer;

public class Offer58_2 {
    public String LeftRotateString(String str, int n) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        if (str == null || str.length() == 0)
            return null;
        if (n > end)
            return str;
        resverse(chars, start, end);
        resverse(chars, 0, end - n);
        resverse(chars, end - n + 1, end);
        return new String(chars);

    }

    private void resverse(char[] chars, int start, int end) {
        while (start <= end) {
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            end--;
            start++;

        }
    }

    public static void main(String[] args) {
        Offer58_2 o = new Offer58_2();
        System.out.println(o.LeftRotateString("abcXYZdef", 2));
    }
}
