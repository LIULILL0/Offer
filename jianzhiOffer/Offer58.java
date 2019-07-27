package jianzhiOffer;

public class Offer58 {
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        int l = 0;
        int r = chars.length-1;
        resverse(chars,l,r);
        int start = 0;
        int end = 0;
        while (start < chars.length) {
            while (end<chars.length && chars[end] != ' ') {
                end++;
            }
            resverse(chars,start,end-1);
            end++;
            start = end;

        }
        return new String(chars);

    }

    private void resverse(char[] chars,int start,int end) {
        while (end >= start) {
            char tmp = chars[end];
            chars[end] = chars[start];
            chars[start] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Offer58 o = new Offer58();
        System.out.println(o.ReverseSentence("I am a stu"));
    }
}
