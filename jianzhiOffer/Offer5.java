package jianzhiOffer;

public class Offer5 {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s.append("20%");
                continue;
            }
            s.append(str.charAt(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(s));
    }
}
